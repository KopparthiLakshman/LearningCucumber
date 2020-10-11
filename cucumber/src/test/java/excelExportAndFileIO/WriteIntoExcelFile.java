package excelExportAndFileIO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;


public class WriteIntoExcelFile {

	@Test
	public void writeExcel() throws Exception{

		File file =  new File("D:\\Selenium.xlsx");
		FileInputStream inputStream = new FileInputStream(file);
		XSSFWorkbook wbook = new XSSFWorkbook(inputStream);
//		XSSFSheet sheet = wbook.createSheet();
		XSSFSheet sheet = wbook.getSheetAt(0);
		
//		XSSFSheet sheet2 = wbook.getSheet("Sheet1");
//		sheet2.getRow(0).
		
		
		int rowCount = sheet.getLastRowNum();
		System.out.println("Row count in excel :" + rowCount);

		sheet.createRow(1).createCell(0).setCellValue("Lakshman");
		sheet.getRow(1).createCell(1).setCellValue("kopparthi");
		//		Row newRow = sheet.createRow(rowCount+1);


		//Close input stream
		inputStream.close();

		//Create an object of FileOutputStream class to create write data in excel file
		FileOutputStream outputStream = new FileOutputStream(file);

		//write data in the excel file
		wbook.write(outputStream);

		//close output stream
		outputStream.close();
	}
}