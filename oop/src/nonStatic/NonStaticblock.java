package nonStatic;

public class NonStaticblock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main method excecuting");
		NonStaticblock obj = new NonStaticblock();
		

	}
	NonStaticblock(){
		System.out.println("Constructor executing");
	}
	{
		System.out.println("Instance block excecuting");
	}

}
