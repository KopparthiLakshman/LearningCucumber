package conection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

public class ConnectToDB {

	@Test
	public void Connect() throws ClassNotFoundException, SQLException {

//			Connection con ;
			Class.forName("com.mysql.jdbc.Driver");
//			System.out.println("Driver loaded");
			Connection  con = DriverManager.getConnection("jdbc:mysql://localhost:3306/?","root","password");  
//			System.out.println("Create connection");
			Statement stmt=con.createStatement();  
			ResultSet rs=stmt.executeQuery("select * from classicmodels.customers");  
			while(rs.next()) {
				System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));
			}
//		finally {
//			con.close();  
//		}
	}

}
