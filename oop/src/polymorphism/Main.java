package polymorphism;
class Main{
	public static void main(String[] args) {
			Calculator c = new Calculator();
			c.add();
			c.sub();
			c.mul();
			c.div();
	}
}
abstract class Calci1 {
		public abstract void add();
		public void sub() {
			int a = 10, b = 5;
			System.out.println("Difference = " + (a - b) );
		}
}
abstract class Calci2 extends Calci1 {
	public abstract void mul();
	public abstract void div();
}
class Calculator extends Calci2{
	public void mul() {
		int a = 10, b = 5;
		System.out.println("Prod = " + (a * b) );
	}
	public void div() {
		int a = 10, b = 5;
		System.out.println("Quotient = " + (a / b) );
	}
	public void add() {
		int a = 10, b = 5;
		System.out.println("Sum = " + (a + b) );
	}
}
