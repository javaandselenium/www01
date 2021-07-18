package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

import com.mysql.cj.jdbc.Driver;

public class Test0 {
	@Test
	public void demo() throws SQLException {
	//Step:1 Register to the database
		Driver driver=new Driver();
		DriverManager.registerDriver(driver);
		//Step:2 connect to database
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/www01","root","root");
		//Step:3 Create the sql query statement
		Statement statement = con.createStatement();
		String query="select * from www01table";
		//Step:4 execute query
		ResultSet result = statement.executeQuery(query);
		while(result.next()) {
			System.out.println(result.getString(1));
			System.out.println(result.getString(2));
		}
		
		//step 5 close the database
		con.close();
		
		
		
		
	}

}
