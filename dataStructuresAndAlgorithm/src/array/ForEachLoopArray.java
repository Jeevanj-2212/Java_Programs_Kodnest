package array;

import java.util.Scanner;

public class ForEachLoopArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the size of the array");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int marks[] = new int[n];
		for(int i =0 ;i<marks.length;i++) {
			System.out.println("Enter "+(i+1)+" element");
			marks[i] = sc.nextInt();
		}
		
		System.out.println("The elements are:");
		for(int i :marks) {
			System.out.println(i);
		}
				
        sc.close();

	}

}
