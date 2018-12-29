package Homework_7_Customer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class testDB {

	public static void main(String[] args) throws SQLException {
		String dbDirectory = "C:/Users/silve/eclipse-workspace/JavaComp_105/Resources";
		System.setProperty(
		"derby.system.home", dbDirectory);
		// use the DriverManager to create a
		//Connection object
		String dbUrl = "jdbc:derby:MurachDB";
		String username = "";
		String password = "";
		Connection connection = DriverManager.getConnection(dbUrl, username, password);

	}

}
