package synchronisation;

public class Bathroom implements Runnable{

	@Override
	synchronized public void run() {
		
		try {
			String name= Thread.currentThread().getName();
			System.out.println(name+" is entering Bathroom");
			Thread.sleep(5000);
			System.out.println(name+  " is using the bathroom");
			Thread.sleep(5000);
			System.out.println(name+" is Exiting from the Bathroom");
			Thread.sleep(5000);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
