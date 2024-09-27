package twoDimensionalArray;

import java.util.Scanner;

public class Company {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of companies");
		int n = sc.nextInt();
		System.out.println("Enter the number of Employees");
		int m = sc.nextInt();
		String arr[][] = new String[n][m];
		
		sc.nextLine();
		for(int i =0;i<arr.length;i++) {
			System.out.println("Enter the Employee of Company :" + (i+1));
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j]=sc.nextLine();
			}
		}
		for(int i =0;i<arr.length;i++) {
			System.out.println("Employee of company: " + (i+1));
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}

	}
	

}
