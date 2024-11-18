package exception;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Connection estableshed");
		try {
		Scanner sc = new Scanner(System.in);
		
		int numerator = sc.nextInt();
		int denominator = sc.nextInt();
		int res = numerator/denominator;
		System.out.println("The quotient is : "+res);
		
		}
		catch (Exception e) {
			System.out.println("Arithematic Exception occured..try again");
		}
		System.out.println("Connection Terminated");
		

	}

}
