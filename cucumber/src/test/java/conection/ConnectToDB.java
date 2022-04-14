package conection;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

import enumm.Cons.SERVER_URL;

public class ConnectToDB {
	public static void main(String[] args) {

		System.out.println(SERVER_URL.SVANYC563);
	}

	@Test
	public void Connect() throws ClassNotFoundException, SQLException {

		//			Connection con ;
		Class.forName("com.mysql.jdbc.Driver");
		//			System.out.println("Driver loaded");
		Connection  con = DriverManager.getConnection("jdbc:sql:DESKTOP-7EJ4QKC","root","password");  
		//			System.out.println("Create connection");
		Statement stmt=con.createStatement(); 
		ResultSet executeQuery = stmt.executeQuery("");
		stmt.executeUpdate("");

		PreparedStatement prepareStatement = con.prepareStatement("");
		CallableStatement cal;
		
		ResultSet rs=stmt.executeQuery("select * from classicmodels.customers");
		
		
		
		while(rs.next()) {
			System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));
		}
		//		finally {
		//			con.close();  
		//		}
	}

}
