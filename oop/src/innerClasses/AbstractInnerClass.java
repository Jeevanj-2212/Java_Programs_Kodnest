package innerClasses;

abstract class Greeter1 {
	abstract void greet();
	abstract void greet2();
}

public class AbstractInnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Greeter1 englishGreeter = new Greeter1() {
			public void greet() {
				System.out.println("Hello world");
			}
			public void greet2() {
				System.out.println("Greeter 2 ");
			}
		};
		englishGreeter.greet();
		englishGreeter.greet2();

	}

}