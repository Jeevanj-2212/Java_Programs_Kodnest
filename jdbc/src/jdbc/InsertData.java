package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
//import java.sql.ResultSet;
import java.util.Scanner;

public class InsertData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con = null;
		PreparedStatement ps = null;
		/*ResultSet rs = null;*/
		Scanner sc = new Scanner(System.in);
		String path = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/jdbc";
		String user = "root";
		String password = "22122002";
		String sql = "insert into kodnest values(?,?,?)";
		try {
			//Step 1 loading the driver
			
			Class.forName(path);
			// Step 2 Making the connection
			
			con = DriverManager.getConnection(url,user,password);
			//step 3 prepared Statements
			
			ps= con.prepareStatement(sql);
			System.out.println("Enter the id ,name and marks");
			int id = sc.nextInt();
			String name = sc.next();
			int marks = sc.nextInt();
			
			ps.setInt(1, id);
			ps.setString(2, name);
			ps.setInt(3, marks);
			
			// STEP 4 querying
			
			int nora = ps.executeUpdate();
			
			//STEP 5 display result 
			System.out.println(nora+ " Row(s) affected");
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		//step 6 Closing
		finally {
			try {
				con.close();
				ps.close();
				sc.close();
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}

	}

}
