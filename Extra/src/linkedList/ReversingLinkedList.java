package linkedList;

import java.util.LinkedList;
import java.util.Scanner;

public class ReversingLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> l = new LinkedList<>();
		new ReversingLinkedList().reverse(l);

	}
	public void reverse(LinkedList<Integer>l) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int n = sc.nextInt();
		System.out.println("Enter the elements: ");
		for(int i =0;i<n;i++) {
			int val = sc.nextInt();
			l.add(val);
		}
		System.out.println("Elements in the reverse order are: ");
		for(int i=n-1;i>=0;i--) {
			System.out.println(l.get(i));
		}

	}
	

}
