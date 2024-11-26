package threading;

public class MultithreadMain2  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Multithread1 t1 = new Multithread1();
		Multithread2 t2 = new Multithread2();
		Multithread3 t3 = new Multithread3();
		t1.start();
		t2.start();
		t3.start();
		
      
	}

}
