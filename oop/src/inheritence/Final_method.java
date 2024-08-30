package inheritence;

public class Final_method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Child1().info();

	}

}
class Parent1 {
	 final void info () {
		System.out.println("This is the final parent method.");
	}
}
class Child1 extends Parent1 {
	void info1() {
		System.out.println("This is child method.");
	}
}
