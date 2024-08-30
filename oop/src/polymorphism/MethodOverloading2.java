package polymorphism;

public class MethodOverloading2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Display d = new Display();
		d.show(45);
		d.show("Hello");
		d.show(45, 54);

	}

}
class Display {
	void show(int a) {
		System.out.println("Integer: "+a);
	}
	void show(String a) {
		System.out.println("String: "+a);
	}
	void show(int a ,int b) {
		System.out.println("int 1: "+a+",int2: "+b);
	}
}
