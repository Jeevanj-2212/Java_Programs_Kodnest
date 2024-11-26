package threading;

import java.util.Scanner;

public class Multithread1 extends Thread {
	@Override
    public void run() {
    Scanner sc = new Scanner(System.in);
  	  System.out.println("Login activity started");
  	  System.out.println("Enter username and password");
  	  String uname = sc.next();
  	  String pwd = sc.next();
  	  System.out.println("welcome login succesful");
  	  System.out.println("Login activity ended");
    }
   
}
