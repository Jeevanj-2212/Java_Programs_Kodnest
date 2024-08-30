package inheritence;

public class Final_Variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Fi().display();

	}

}
class Fi {
	final int max_speed = 150;
	void display() {
		System.out.println("The finale speed is "+max_speed);
	}
}
