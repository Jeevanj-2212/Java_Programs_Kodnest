package twoDimensionalArray;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows: ");
		int n = sc.nextInt();
		System.out.println("Enter the number of columns");
		int m = sc.nextInt();
		int arr[][] = new int[n][m];
		System.out.println("Enter the array elemnts");
		for(int i = 0;i<arr.length;i++) {
			
			for(int j =0;j<arr[i].length;j++) {
				System.out.println("Enter the element for row " + i +" column " + j);
				arr[i][j] = sc.nextInt();
			}
			
		}
  System.out.println("Array elements are: ");
  for(int i = 0;i<arr.length;i++) {
	  
		for(int j =0;j<arr[i].length;j++) {
			
			System.out.print(arr[i][j]+" ");
		}
		System.out.println();
	}
	}

}
