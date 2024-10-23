package collection;
import java.util.*;

public class Linkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList ll = new LinkedList();
		ll.add(20);
		ll.add(30);
		ll.add(23);
		ll.add("hello");
		System.out.println(ll);
		// Using traditional for loop
		for(int i=0;i<ll.size();i++) {
			System.out.print(ll.get(i)+" ");
		}
		System.out.println();
		// Using for each
		for(Object x:ll) {
			System.out.print(x+" ");
		}
		System.out.println();
		Iterator itr = ll.iterator();
		// Using iterator
		while(itr.hasNext()==true) {
			System.out.print(itr.next()+" ");
			
		}

	}

}
