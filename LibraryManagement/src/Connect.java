

	import java.awt.*;

	import javax.swing.*;

	import java.sql.*;
	import java.io.*;
	public class Connect {
		static Connection conn = null;
		/**
		 * @param args
		 */
		
		public int Connection1(String query){
				String url = "jdbc:mysql://localhost:3306/Library"; // direct connect to database in url
				String user = "root";
				String password = "root";
				
				try {
					conn = DriverManager.getConnection(url, user, password);
					Statement stmt = conn.createStatement();
					int affectedrows = stmt.executeUpdate(query);
					conn.close();
					return affectedrows;
					} 
				//System.out.println("Success!!"); 
				catch(SQLException ex) {
					System.out.println("Error in connection: " + ex.getMessage());
					return 0;
				}
		}
		public ResultSet Connection(String query) {
			
			/* Initialize variables for login creds */
			String url = "jdbc:mysql://localhost:3306/Library"; // direct connect to database in url
		//	String url = "jdbc:mysql://localhost:3306/";
			String user = "root";
			String password = "root";
			
			try {
				conn = DriverManager.getConnection(url, user, password);
				Statement stmt = conn.createStatement();
					ResultSet rs = stmt.executeQuery(query);
					return rs;
				} 

			// Always close the recordset and connection.
			/*	rs.close();
			//	conn.close();
			//	System.out.println("Success!!"); */
			catch(SQLException ex) {
				System.out.println("Error in connection: " + ex.getMessage());
				return null;
			}
		}
		
		public void Connection2(String query) {
			
			/* Initialize variables for login creds */
			String url = "jdbc:mysql://localhost:3306/Library"; // direct connect to database in url
		//	String url = "jdbc:mysql://localhost:3306/";
			String user = "root";
			String password = "root";
			
			try {
				conn = DriverManager.getConnection(url, user, password);
				Statement stmt = conn.createStatement();
				stmt.executeUpdate(query);
					//ResultSet rs = stmt.Query(query);
					//return rs;
				System.out.println("Data manipulation successful");
				} 

			// Always close the recordset and connection.
			/*	rs.close();
			//	conn.close();
			//	System.out.println("Success!!"); */
			catch(SQLException ex) {
				System.out.println("Error in connection: " + ex.getMessage());
				return ;
			}	

	}
		
	}

