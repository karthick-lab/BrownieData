package BrowniesData.BrowniesData;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

public class Base {
	
	public static String message;
	
	 public static void insertdata(String shopname, int noofpices, String dateoforder)
	    {
	        // Database URL, username, and password

	        // Replace with your database name
	        String url
	            = "jdbc:mysql://192.168.1.34:3306/browniedata";
	        
	        
	       // root/root@123

	        // Replace with your MySQL username
	        String username = LoginUI.ID;

	        // Replace with your MySQL password
	        String password = LoginUI.key;

	        // Updated query syntax for modern databases
	        String query
	            = "INSERT INTO BrownieData (ShopName, Noofpices, Dateoforder) VALUES ('"+shopname+"',"+noofpices+", '"+dateoforder+"')";
	        System.out.println("Connection not established1");
	        // Establish JDBC Connection
	        try {
	          
	            // Load Type-4 Driver
	            // MySQL Type-4 driver class
	            Class.forName("com.mysql.cj.jdbc.Driver");

	            System.out.println("Connection not established");
	            
	            // Establish connection
	            Connection c = DriverManager.getConnection(
	                url, username, password);
	            System.out.println("Connection established");

	            // Create a statement
	            Statement st = c.createStatement();

	            // Execute the query
	            int count = st.executeUpdate(query);
	            
	            message="Successfully submitted";

	            // Close the connection
	            st.close();
	            c.close();
	            System.out.println("Connection closed.");
	        }
	        catch (ClassNotFoundException e) {
	        	message="ClassNotFoundException occured";
	        }
	        catch (SQLException e) {
	        	message="SQLException occured";
	        	message=message+"\n"+e.getMessage();	        }
	    }
	

}
