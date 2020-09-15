package file.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class Connection {
	static Properties prop = new Properties();
	static InputStream input = null;
	public Connection() {

	}

	public static void main(String[] args) throws Exception {

		OutputStream output = null;  

		try {
			output = new FileOutputStream("config.properties");
			// set the properties value
			prop.setProperty("database", "localhost");
			prop.setProperty("dbuser", "oracleDB");
			prop.setProperty("dbpassword", "password");
			prop.setProperty("Name", "Lakshman");

			/** null - save properties to project root folder*/
			prop.store(output, null);

		} catch (IOException io) {
			io.printStackTrace();
		}

		try {
			input = new FileInputStream("config.properties");
			prop.load(input);

			// get the property value and print it out
			System.out.println(prop.getProperty("database"));
			System.out.println(prop.getProperty("dbuser"));
			System.out.println(prop.getProperty("dbpassword"));

		} catch (IOException ex) {
			ex.printStackTrace();
		}

		finally {
			input.close();
		}
	}
}
