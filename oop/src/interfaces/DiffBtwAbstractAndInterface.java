package interfaces;

public class DiffBtwAbstractAndInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A b = new B();
		System.out.println("Abstract variable " + b.av);
		System.out.println("Static voariable " + b.av1);
		b.non_static();
		b.static_meth();

	}

}
abstract class A {
	int av = 4;
	static int av1 =5;
	void non_static() {
		System.out.println("This is non static method");
	}
	static void static_meth() {
		System.out.println("This is static method");
	}
	static {
		System.out.println("This is static block");
	}
	/*default void def() {
		System.out.println("This is default method");
	}*/
	public static void main(String[] args) {
		System.out.println("Main method");
	}
}
class B extends A {
	
}
