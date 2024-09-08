package constructor;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Child();

	}

}
class Parent {
	Parent() {
		System.out.println("Parent Constructor");
	}
}
class Child extends Parent{
	
}
