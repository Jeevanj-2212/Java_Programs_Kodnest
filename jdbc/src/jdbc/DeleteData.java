package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;
//import java.sql.ResultSet;

public class DeleteData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con = null;
		PreparedStatement ps = null;
		Scanner sc = new Scanner(System.in);
		//ResultSet rs = null;
		String path = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/jdbc";
		String user = "root";
		String password = "22122002";
		String sql = "delete from kodnest where id = ?";
		
		try {
			//Step 1 driver loading
			
			Class.forName(path);
			// Step 2 connection establishing
			
			con = DriverManager.getConnection(url,user,password);
			
			// Step 3 creating prepared Statement
			ps = con.prepareStatement(sql);
			System.out.println("enter the id to be deleted");
			
			int id = sc.nextInt();
			ps.setInt(1, id);
			
			//step 4 Querying
			
			int nora = ps.executeUpdate();
			
			
			//STEP 5 Displaying the result
			
			System.out.println(nora+" Row(s) affected");
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally {
			
			
			try {
				con.close();
				ps.close();
				
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}

	}

}
