package array;

import java.util.Scanner;

public class StringArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int n = sc.nextInt();
		String arr[] = new String[n];
		sc.nextLine();
		for(int i = 0; i<arr.length;i++) {
			System.out.println("Enter the employee Name " + (i+1));
			arr[i]=sc.nextLine();
		}
		for(int i = 0; i<arr.length;i++) {
			System.out.println("The name of the Employee " + (i+1) + " is");
			System.out.println(arr[i]);
		}
		

	}

}
