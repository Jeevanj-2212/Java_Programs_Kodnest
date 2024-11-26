package mutithreadingProblems;

public class ActivitiesApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println("Main activity started and resources are Allocated");
			Activities a= new Activities();
			Thread t1 = new Thread(a);
			Thread t2 = new Thread(a);
			Thread t3 = new Thread(a);
			
			t1.setName("login");
			t2.setName("print");
			t3.setName("mul");
			
			t1.start();
			t2.start();
			t3.start();
			
			t1.join();
			t2.join();
			t3.join();
			
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println("Main Avtivity ended and resources are De Allocated");

	}

}
