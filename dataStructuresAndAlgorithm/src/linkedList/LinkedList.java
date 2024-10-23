package linkedList;

import java.util.Scanner;

public class LinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		LinkedListOperations ll= new LinkedListOperations(); 
		while(true) {
			System.out.println("1->insert front\n");
			int n=sc.nextInt();
			switch(n) {
			case 1: System.out.println("Enter the element");
			ll.insertFront(sc.nextInt());
			break;
			default: System.out.println("Byee");
			return;
			}
		}

	}

}
