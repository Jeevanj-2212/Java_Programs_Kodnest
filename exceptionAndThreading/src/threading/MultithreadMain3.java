package threading;

public class MultithreadMain3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Job1 j1 = new Job1();
		Job2 j2 = new Job2();
		Job3 j3 = new Job3();
		
		Thread t1 = new Thread(j1);
		Thread t2 = new Thread(j2);
		Thread t3 = new Thread(j3);
		
		t1.start();
		t2.start();
		t3.start();
		
		

	}

}
