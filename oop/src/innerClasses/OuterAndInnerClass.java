package innerClasses;

public class OuterAndInnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer o = new Outer();
		Outer.Inner i = o.new Inner();
		i.fun2();

	}

}
class Outer {
	int x = 100;
	void fun1() {
		System.out.println("Outer class method");
	}
	class Inner {
		void fun2() {
			System.out.println("Inner method");
			System.out.println("The variable is: " + x);
			fun1();
		}
	}
}
