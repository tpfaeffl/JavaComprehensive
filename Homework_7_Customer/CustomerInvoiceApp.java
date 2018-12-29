package Homework_7_Customer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CustomerInvoiceApp {

	public static void main(String[] args) {
		
		System.out.println("Welcome to the Customer Invoice Report");
		
		Connection connection = getConnection();
		try {
			Statement statement = connection.createStatement(
					ResultSet.TYPE_FORWARD_ONLY,
					ResultSet.CONCUR_READ_ONLY);
		
			// just to try it out, select all from Customers table
			String query = "SELECT * FROM Products";
		
			ResultSet rs = statement.executeQuery(query);
			System.out.println(rs.toString());
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	private static Connection getConnection() {
		
		Connection connection = null;
		try {
		
			String dbDirectory = "Resources";
			System.setProperty("derby.system.home", dbDirectory);
			// use the DriverManager to create a
			//Connection object
			String dbUrl = "jdbc:derby:BineetDB";
			String username = "";
			String password = "";
			connection = DriverManager.getConnection(dbUrl, username, password);
	//	connection = connect();
		return connection;
		}
		catch (SQLException e) {
			System.err.println("Error loading database driver: " + e);
			for (Throwable t : e)
				e.printStackTrace();
			return connection;
		}
	}

}
