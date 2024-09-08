package interfaces;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo d = new Demo2();
		d.abstractMethod();
		d.defaultMethod();
		Demo.staticMethod();

	}

}
interface Demo {
	public abstract void abstractMethod();
	public static void staticMethod() {
		System.out.println("Static method");
	}
	default void defaultMethod() {
		System.out.println("default method");
	}
}
class Demo2 implements Demo {

	@Override
	public void abstractMethod() {
		// TODO Auto-generated method stub
		System.out.println("Overridden Abstract method");
		
	}
	
}
