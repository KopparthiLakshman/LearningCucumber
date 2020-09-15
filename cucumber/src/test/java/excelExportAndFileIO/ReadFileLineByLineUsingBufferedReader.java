package excelExportAndFileIO;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileLineByLineUsingBufferedReader {

	BufferedReader reader;
	String line ;
	
	public String readLineFromTxtFile() {
		try {
			File src = new File("C:\\Share\\myfile.txt");
			reader = new BufferedReader(new FileReader(src));
			line = reader.readLine();
			while (line != null) {
				System.out.println(line.trim());
				line = reader.readLine();
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
