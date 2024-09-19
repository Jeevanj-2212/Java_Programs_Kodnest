package array;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*marks[0] = 95;
		marks[1] = 80;
		marks[2] = 75;
		marks[3] = 52;
		marks[4] = 70;*/
		System.out.println("Enter the size of the array");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int marks[] = new int[n];
		for(int i =0 ;i<marks.length;i++) {
			System.out.println("Enter "+(i+1)+" element");
			marks[i] = sc.nextInt();
		}
		/*System.out.println(marks[0]);
		System.out.println(marks[1]);
		System.out.println(marks[2]);
		System.out.println(marks[3]);
		System.out.println(marks[4]);*/
		System.out.println("The elements are:");
		for(int i = 0;i<5;i++) {
			System.out.println(marks[i]);
		}
				
        sc.close();
	}

}
