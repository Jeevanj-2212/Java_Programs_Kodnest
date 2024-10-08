package linkedList;

import java.util.LinkedList;

public class LinkList {
	public static void main(String[] args) {
		LinkedList l= new LinkedList();
		
		l.add("Jeevan");
		l.add(1,"roni");
		System.out.println(l.get(1));
		l.addFirst(1);
		
		l.add(2,8);
		
		l.removeLast();
		l.removeFirst();
		
		l.addLast("SoftTech");
		System.out.println("Linked list");
		System.out.println(l.get(0));
	
		System.out.println(l);
	}
}