package com;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import beforeClass.intiateDriver;

public class Excel_Currency_converter {

	WebDriver driver;

	@Test
	public void curr_In_INR() throws Exception { 

		String From_currency=null;

		driver = intiateDriver.getChromerDriver();
		driver.get("http://www.xe.com/currencyconverter/");

		String To_currency = null;
		File src_file = new File("D:\\EclipseWorkSpace_01_03_2015\\Docs\\Currency.xlsx");
		FileInputStream file_FIS = new FileInputStream(src_file);
		XSSFWorkbook wb = new XSSFWorkbook(file_FIS);
		XSSFSheet sheet_no  = wb.getSheetAt(0);

		FileOutputStream file_FOS = new FileOutputStream(src_file);
		XSSFWorkbook workbook = new XSSFWorkbook(file_FIS);
		XSSFSheet createSheet = workbook.createSheet("Sheet1");
		XSSFRow createRow = createSheet.createRow(0);
		XSSFCell createCell = createRow.createCell(0);
		createCell.setCellValue("Fisrt Data to input");
		workbook.write(file_FOS);
		
		

		//		  if (excelFilePath.endsWith("xlsx")) {
		//		        workbook = new XSSFWorkbook();
		//		    } else if (excelFilePath.endsWith("xls")) {
		//		        workbook = new HSSFWorkbook();
		//		    } else {
		//		        throw new IllegalArgumentException("The specified file is not Excel file");
		//		    }

		int count = sheet_no.getLastRowNum();
		System.out.println("No of rows in excel : "+count);

		for (int i = 1; i <= count; i++) {
			From_currency = sheet_no.getRow(i).getCell(1).getStringCellValue().trim();
			for (int j = i; j < i+1; j++) {
				To_currency   = sheet_no.getRow(j).getCell(2).getStringCellValue().trim();
			}

			System.out.println("From_currency = "+i+ " " +From_currency);
			System.out.println("To_currency = "+i+ " " +To_currency);

			driver.findElement(By.xpath("//*[@id='from']")).clear();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id='from']")).sendKeys(From_currency, Keys.ARROW_DOWN, Keys.TAB);

			driver.findElement(By.xpath("//*[@id='to']")).clear();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id='to']")).sendKeys(To_currency, Keys.ARROW_DOWN, Keys.TAB);
			Thread.sleep(2000);

			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id='uccGoBtnImg']")).click();
			Thread.sleep(1000);

			String text = driver.findElement(By.xpath("//*[@id='ucc-container']/span[2]/span[2]")).getText();

			System.out.println("row : "+ i + " conversion "+text);


			//			To_currency   = sheet_no.getRow(j).getCell(2).getStringCellValue().trim();
			//	        wb.write(text);

		}

		driver.quit();
	}
}
