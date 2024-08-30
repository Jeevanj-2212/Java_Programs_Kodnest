package inheritence;

public class UpcastingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c = new Child();
		c.fun();
		
		Parent c2= new Child();
		c2.fun();

	}

}
class Parent {
	 static void fun () {
		System.out.println("Parent-fun");
	}
}
class Child extends Parent{
	 static void fun () {
		System.out.println("Child-fun");
	}
}
