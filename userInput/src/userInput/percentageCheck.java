package userInput;

import java.util.Scanner;

public class percentageCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your gender");
		char gender = sc.next().charAt(0);
		System.out.println("Enter your percentage");
		double percentage = sc.nextDouble();
		switch(gender) {
		case 'M':
			if(percentage >= 85) {
				System.out.println("Excellent");
			} else if (percentage >= 60) {
				System.out.println("Good");
			} else if (percentage >= 35) {
				System.out.println("Poor");
			}
			else {
				System.out.println("fail");
			}
			
			break;
		case 'F':
			if(percentage >= 70) {
				System.out.println("Excellent");
			} else if (percentage >= 50) {
				System.out.println("Good");
			} else if (percentage >= 35) {
				System.out.println("okay");
			}
			else {
				System.out.println("Do better next time");
			}
			
			
			break;
		default: System.out.println("Invalid Gender");	
		}

	}

}
