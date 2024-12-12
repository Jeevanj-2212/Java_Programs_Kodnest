package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class MonetTransfer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con = null;
		PreparedStatement psmt1 = null;
		PreparedStatement psmt2 = null;
		Scanner sc = new Scanner(System.in);
		String path = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/bank";
		String username = "root";
		String password = "22122002";
		String sql1 = "update icici set amount = amount-? where accno=?";
		String sql2 = "update icici set amount = amount+? where accno=?";
		
		try {
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		

	}

}
