package polymorphism;

public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Addition a = new Addition();
				a.add(1.7, 1.8);
				a.add(1, 2);
				a.add(1.8, 1.85, 9.5);
				a.add(2.5, 22, 12);
				a.add(5, 5, 10);

	}

}
class Addition {
	public void add (int a ,int b) {
		System.out.println("Sum = "+(a+b));
	}
	public void add (double a, double b) {
		System.out.println("Sum = "+(a+b));
	}
	public void add (double a ,double b,double c) {
		System.out.println("Sum = " + (a+b+c));
	}
	public void add(int a,int b,int c) {
		System.out.println("Sum = " + (a+b+c));
	}
	public void add(double a,int b,int c) {
		System.out.println("sum = " + (a+b+c));
	}
}
