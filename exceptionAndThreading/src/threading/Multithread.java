package threading;

import java.util.Scanner;

public class Multithread extends Thread {
	@Override
		public void run() {
			// TODO Auto-generated method stub
			String name = Thread.currentThread().getName();
			if(name.equals("login")) {
				login();
			}
			else if(name.equals("print")) {
				printing();
			}
			else {
				multiplication();
			}
		}
  public void login() {
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Login activity started");
	  System.out.println("Enter username and password");
	  String uname = sc.next();
	  String pwd = sc.next();
	  System.out.println("welcome login succesful");
	  System.out.println("Login activity ended");
  }
  public void printing() {
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
  public void multiplication() {
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
