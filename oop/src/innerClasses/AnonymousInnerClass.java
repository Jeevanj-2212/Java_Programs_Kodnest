package innerClasses;
interface Greeter {
	void greet();
	void greet2();
}

public class AnonymousInnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Greeter englishGreeter = new Greeter() {
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
