package innerClasses;

public class StaticInner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Outer1.Inner1 = new Outer.Inner();
		Outer1.Inner1.fun2();

	}

}
 class Outer1 {
	static int x = 100;
	int y =22;
	public static void fun1() {
		System.out.println("Outer static method");
		//System.out.println("Outer Non Static y: " + y);
	}
	public void fun2() {
		System.out.println("outer Non-static method");
	}
	static class Inner1 {
		static int a = 24;
		public static void fun2() {
			System.out.println("Outer Static x: " + x);
			//System.out.println("Outer Non Static y: " + y);
			//System.out.println("Inner Non Static a: " + a);
			fun1();
			// non static
			Outer1 o = new Outer1();
			System.out.println("outer non static variable: " + o.y);
			o.fun2();
		}
	}
}
