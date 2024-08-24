package arrayProblems;

import java.util.Scanner;

public class ArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the array:");
		int n = sc.nextInt();
		int arr1[]= new int[n];
		int arr2[] = new int[n];
		int res[] = new int[n];
		System.out.println("Enter the element of the first array");
		for(int i =0;i<n;i++) {
			arr1[i]= sc.nextInt();
			
			
		}
		System.out.println("Enter the element of the second array");
		for(int i=0;i<n;i++) {
			arr2[i]= sc.nextInt();
		}
		System.out.println("The sum of the array");
		for(int i=0;i<n;i++) {
			res[i]=arr1[i]+arr2[i];
			System.out.println(res[i]);
					
		}
		
		

}
}
