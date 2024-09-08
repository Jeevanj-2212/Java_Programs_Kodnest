package constructor;

public class SuperKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Childd c= new Childd();
		c.display();

	}

}
class Parentt {
	int x = 10;
	void fun() {
		System.out.println("Parent Fun");
	}
}
class Childd extends Parentt {
	int x = 20;
	void fun () {
		System.out.println("Child fun");
	}
	void display() {
		System.out.println("Child x = "+x);
		fun();
		System.out.println("Parent x = " + super.x);
		super.fun();
	}
}
