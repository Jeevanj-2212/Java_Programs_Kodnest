package polymorphism;

import java.util.Scanner;

public class CalculatorApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyCalculator m = new MyCalculator();
		CalculatorApp c = new CalculatorApp();
		c.accessCalculator(m);
	}
	public void accessCalculator(Calculator1 c) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		c.add(a, b);
		c.sub(a,b);
		c.mul(a, b);
		c.div(a, b);
	}

}
abstract class Calculator1 {
	abstract void add(int a,int b);
	abstract void sub(int a,int b);
	abstract void mul(int a,int b);
	abstract void div(int a,int b);
}
class MyCalculator extends Calculator1 {
	void add(int a,int b){
		System.out.println("Addition = "+(a+b));
		
	}
	void sub(int a,int b) {
		System.out.println("Subtraction = "+(a-b));
		
	}
	void mul(int a,int b) {
		System.out.println("Multiplication = "+(a*b));
		
	}
	void div(int a,int b) {
		System.out.println("Division = "+(a/b));
	}
}