package staticConcepts;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String op = sc.nextLine();
		String opp = op.toLowerCase();
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		switch(opp) {
		case "addition":Mat.add(n1,n2);
		                break;
		case "subtraction":Mat.sub(n1, n2);
		break;
		case "multiplication":Mat.mul(n1, n2);
		break;
		case "division": Mat.div(n1, n2);
		break;
		default:System.out.println("Invalid");
		
		}

	}

}
class Mat{
	public static void add (int a ,int b){
		System.out.println("Addition: "+(a+b));
	}
	public static void sub(int a,int b) {
		System.out.println("Subtraction: "+(a-b));
	}
	public static void mul(int a,int b) {
		System.out.println("Multiplication: "+(a*b));
	}
	public static void div(int a ,int b) {
		System.out.println("Division: "+(a/b));
	}
	
}
