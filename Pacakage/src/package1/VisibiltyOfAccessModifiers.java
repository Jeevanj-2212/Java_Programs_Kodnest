package package1;

public class VisibiltyOfAccessModifiers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c = new Child();
		c.fun();
		// We can maintain or increase the visibility in the inherited child class but 
		// we cannot decrease the visibility.

	}

}
class Parent {
	protected void fun() {
		System.out.println("Parent fun");
	}
}

class Child extends Parent{
	private void fun() {
		System.out.println("Child fun");
	}
}
