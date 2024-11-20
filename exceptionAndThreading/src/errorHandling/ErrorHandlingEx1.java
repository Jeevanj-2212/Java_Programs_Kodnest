package errorHandling;

public class ErrorHandlingEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 10;
		display(x);

	}
	public static void display(int a) {
		try {
		a++;
		System.out.println(a);
		display(a);
		}
		catch(Error e) {
			System.out.println("stack overflow");
		}
	}

}
