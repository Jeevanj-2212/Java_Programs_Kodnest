package collection;

import java.util.LinkedList;

public class FunctionsOfLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList ll = new LinkedList();
		ll.add(20);
		ll.add(30);
		ll.add(25);
		ll.add(22);
		System.out.println(ll);
		System.out.println("=============");
		System.out.println(ll.getFirst());
		System.out.println(ll.getLast());
		System.out.println("=============");
		System.out.println(ll.peek());
		System.out.println(ll);
		System.out.println("=============");
		System.out.println(ll.poll());
		System.out.println(ll);
		System.out.println("=============Peek===========");
		System.out.println(ll.peekFirst());
		System.out.println(ll.peekLast());
		System.out.println(ll);
		System.out.println("=============");
		System.out.println(ll.pollFirst());
		System.out.println(ll);
		System.out.println("=============");
		System.out.println(ll.pollLast());
		System.out.println(ll);
		System.out.println("=============");
		ll.push(100);
		ll.push(99);
		System.out.println(ll);
		System.out.println("=============");
		System.out.println(ll.pop());
		System.out.println(ll.removeFirst());
		System.out.println(ll.removeLast());
		LinkedList ll2 = new LinkedList();
		ll2.add(100);
		ll2.add(99);
		ll2.add(98);
		ll2.add(97);
		System.out.println(ll2);
		System.out.println("=============");
		LinkedList ll3 = new LinkedList();
		ll3.add(100);
		ll3.add(99);
		ll3.add(96);
		ll3.add(97);
		
		System.out.println(ll3);
		ll2.retainAll(ll3);
		System.out.println(ll2);
		
		
		
		
		

	}

}
