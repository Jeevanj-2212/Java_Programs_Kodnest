package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class FetchData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		Scanner sc = new Scanner(System.in);
		String path = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/jdbc";
		String user = "root";
		String password = "22122002";
		String sql = "select * from kodnest where id = ?"; 
		try {
			// STEP 1 Loading the driver
			
			Class.forName(path);
			
			//STEP 2 establish the connection
			
			con = DriverManager.getConnection(url,user,password);
			//Step 3 Create Prepared Statement
			
			ps= con.prepareStatement(sql);
			System.out.println("Enter the id");
			int id = sc.nextInt();
			ps.setInt(1, id);
			
			//Step 4 Querying
			rs = ps.executeQuery();
			
			// step5  Display result 
			try {
				if(rs.next()) {
					System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
				}
				else {
					System.out.println("Enter the correct value");
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			//STEP 6 Close resource
			
			finally {
				try {
					rs.close();
					con.close();
					ps.close();
					sc.close();
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
