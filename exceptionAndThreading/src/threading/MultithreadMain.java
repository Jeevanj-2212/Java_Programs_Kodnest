package threading;

public class MultithreadMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Multithread t1 = new Multithread();
		Multithread t2 = new Multithread();
		Multithread t3 = new Multithread();
		 
		
		t1.setName("login");
		t2.setName("print");
		t3.setName("mul");
		t1.start();
		t2.start();
		t3.start();
		
		

	}

}
