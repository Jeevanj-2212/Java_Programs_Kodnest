package threading;

public class Job3 implements Runnable {

	@Override
	public void run() {
		try {
	  		  System.out.println("Multiplication Activity started");
	  		  int a = 22;
	  		  int b = 12;
	  		  int c = a*b;
	  		  Thread.sleep(5000);
	  		  System.out.println(c);
	  		  System.out.println("Multiplication activity ended");
	  	  }
	  	  
	  	  catch (Exception e) {
	  		// TODO: handle exception
	  		  e.printStackTrace();
	  	}
		
	}

}
