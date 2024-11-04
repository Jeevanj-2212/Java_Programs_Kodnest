package collection;

import java.util.ArrayDeque;

public class ArrayDequeEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayDeque ad = new ArrayDeque();
		ad.add(100);
		ad.add(200);
		ad.add(300);
		ad.addFirst(99);
		System.out.println(ad);
		ad.addLast(20);
		ad.addLast(99);
		System.out.println(ad);
		ad.removeFirstOccurrence(99);
		ad.removeLastOccurrence(99);
		ad.removeLast();
		System.out.println("====Remove Last====");
		System.out.println(ad);
		//offerFirst and offerLast only works if there is space in memory
		//if there is no space in memory then the element will not be inserted
		ad.offerLast(20);
		ad.offerFirst(85);
		
		System.out.println(ad);

	}

}
