package excelExportAndFileIO;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileLineByLineUsingBufferedReader {

	public static void main(String[] args) {
		readLineFromTxtFile();
	}
	
	public static String readLineFromTxtFile() {
		BufferedReader reader;
		String line = null ;
		
		try {
			File src = new File("C:\\Share\\myfile.txt");
			reader = new BufferedReader(new FileReader(src));
			
			while ((line = reader.readLine())!= null) {
				System.out.println(line.trim());
			}
			reader.close();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		return line;
	}
}
