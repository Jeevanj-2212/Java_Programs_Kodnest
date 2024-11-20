package threading;

public class Into {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello world");
		Thread t = Thread.currentThread();
		System.out.println(t);
		t.setName("Sample");
		t.setPriority(1);
		System.out.println(t);

	}

}
