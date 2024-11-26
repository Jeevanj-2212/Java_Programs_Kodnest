package threading;

public class Multithread2 extends Thread {
    @Override
    public void run() {
    	try {
  		  System.out.println("Printing activity started");
  	  for(int i=0;i<5;i++) {
  		  System.out.println("Kodnest");
  		  Thread.sleep(5000);
  	  }
  	  System.out.println("Printing Ended");
  	  }
  	  catch (Exception e) {
  		e.printStackTrace();
  	}
    }
}
