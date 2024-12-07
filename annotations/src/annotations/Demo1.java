package annotations;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("serial")
public class Demo1 extends Demo{
   @Override
   void displayAGreetMessageToUser() {
		 System.out.println("Hi how are you ");

		}
   @SuppressWarnings("unused")
   public static void main(String[] args) {
	int a;
	System.out.println("main method");
	
	@SuppressWarnings("rawtypes")
	List al = new  ArrayList();
}
   
}
