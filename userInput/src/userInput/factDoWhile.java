package userInput;

import java.util.Scanner;

public class factDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number to find the factorial");
		int number = sc.nextInt();
		int factorial = 1;
		
		do {
			factorial = factorial*number;
			number--;
		}while(number >= 1);
		System.out.println("The factorial of the number is : "+factorial);

	}

}
