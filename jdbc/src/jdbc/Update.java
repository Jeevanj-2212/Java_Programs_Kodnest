package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Update {

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
		String sql = "update kodnest set name = ? where id = ?";
		try {
			//step1 load driver
			Class.forName(path);
			//Step 2 :connection
			con = DriverManager.getConnection(url, user, password);
			//Step 3 prepared Statement
			
			ps = con.prepareStatement(sql);
			System.out.println("Enter the id and name");
			int id = sc.nextInt();
			String name = sc.next();
			ps.setInt(2, id);
			ps.setString(1,name);
			// STep 4 Querying
			int nora = ps.executeUpdate();
			// STEP5 Display Result
			System.out.println(nora+" Row(s) affected");
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		//Step 6 closing
		finally {
			try {
				con.close();
				ps.close();
				sc.close();
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}

	}

}
