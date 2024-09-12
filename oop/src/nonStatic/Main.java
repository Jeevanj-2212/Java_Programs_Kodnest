package nonStatic;


 class NonStaticStatic {
	static int a = 10;
	static int b;
	int x =200;
	int y;
	static {
		System.out.println("Static block");
	}
	{
		System.out.println("Instance block");
	}
	public static void fun1() {
		System.out.println("Static method");
	}
	public void fun2() {
		System.out.println("Non static method");
	}
	NonStaticStatic(){
		System.out.println("Constructor");
	}

	

}
public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main method ");
		NonStaticStatic d = new NonStaticStatic();
		d.fun1();
		d.fun2();

	}
}
