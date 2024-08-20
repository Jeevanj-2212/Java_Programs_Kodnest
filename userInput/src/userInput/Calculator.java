package userInput;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		add();
		Scanner sc = new Scanner(System.in);
		System.out.println("Subtraction");
		int num1 = sc.nextInt();
		int num2 =sc.nextInt();
		sub(num1,num2);
		int res= mul();
		System.out.println(res);
		System.out.println("division");
		double num11 = sc.nextDouble();
		double num22 =sc.nextDouble();
		double res1 =div(num11,num22);
		System.out.println(res1);
		
		

	}
	static void add() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Addition");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int sum = num1+num2;
		System.out.println("The sum of the number is  "+sum);
	}
	static void sub(int num1,int num2) {
		
		int diff = num1-num2;
		System.out.println("the Subtraction of the number is "+ diff);
	}
	static int mul() {
		System.out.println("Multiplication");
		Scanner sc = new Scanner (System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int mul = num1*num2;
		return mul;
		}
	static double div(double num1,double num2) {
		
		double div = num1/num2;
		return div;
		
		
	}
	

}
