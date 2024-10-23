package stack;

import java.util.Scanner;

public class Stacks {
	public static void main(String[] args) {
		System.out.println("Enter the value for stck size:");
		Scanner sc = new Scanner(System.in);
		int size= sc.nextInt();
		int s[]=new int[size];
		
		StckOperation stack= new StckOperation(size);
		
		while(true) {
			System.out.println("Enter your choice ");
			System.out.println("1->Insert\n2->delete\n3->display\npress any other key to exit");
			int choice = sc.nextInt();
			switch(choice) {
			case 1:System.out.println("Enter the element to be inserted");
			        stack.insert(sc.nextInt());
			        break;
			case 2:stack.delete();
			break;
			case 3:stack.display();
			break;
			default:System.out.println("Bye");
			return;
			}
		}
		
	}
	
    
	
    
}
