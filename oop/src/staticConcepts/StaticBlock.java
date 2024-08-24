package staticConcepts;

public class StaticBlock {
	static int x =10;
	static int y;
	static {
		System.out.println("Static block Executing");
	}
	public static void fun1() {
		System.out.println("Static method executing");
	}
	int a =99;
	int b;
	public void fun2() {
		System.out.println("non-static method executing");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main method executing");
		fun1();
		StaticBlock obj = new StaticBlock();
		obj.fun2();
		System.out.println("x = "+x+"y = "+y);
		System.out.println("a = "+obj.a+"b = "+obj.b);
		

	}

}
