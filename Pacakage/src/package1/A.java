package package1;

public class A {

	private void fun1() {
		System.out.println("Private method");
		
	}
	void fun2() {
		System.out.println("Default Method");
	}
	protected void fun3() {
		System.out.println("Protected Method");
	}
	public void fun4() {
		System.out.println("Public method");
	}
	public static void main(String[] args) {
		new A().fun1();
		new A().fun2();
		new A().fun3();
		new A().fun4();
		
	}
}
 
