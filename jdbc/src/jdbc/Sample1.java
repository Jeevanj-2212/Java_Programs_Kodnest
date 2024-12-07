package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Sample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//STEP 1 LOADING THE DRIVER
			Class.forName("com.mysql.cj.jdbc.Driver");

			System.out.println("Driver Loaded");
			
			// Step 2 Establish the connection
			
			Connection con =  DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "22122002");
			System.out.println("Connection Established");
			
			//Step 3:Statement Creation
			Statement stmt = con.createStatement();
			System.out.println("Statement Created");
			
			//Step 4: Querying
			
			String sql = "select * from kodnest";
			
			ResultSet rs = stmt.executeQuery(sql);
			System.out.println("Query executed ");
			
			//Step 5: Displaying the result 
			System.out.println("ID"+"   |   "+"NAME"+"      |   "+"MARKS"+"   |   ");
			while(rs.next()) {
				System.out.println(rs.getInt(1)+"    |   "+rs.getString(2)+"    |   "+rs.getInt(3));
			}
			
			con.close();
			stmt.close();
			rs.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
