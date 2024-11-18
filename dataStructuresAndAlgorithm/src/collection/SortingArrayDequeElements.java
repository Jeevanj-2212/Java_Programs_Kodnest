package collection;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;

public class SortingArrayDequeElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayDeque ad = new ArrayDeque();
		ad.add(100);
		ad.add(50);
		ad.add(150);
		ad.add(25);
		ad.add(75);
		ad.add(125);
		ad.add(175);
		System.out.println("Before sorting "+ad);
		ArrayList al = new ArrayList();
		al.addAll(ad);
		Collections.sort(al);
		System.out.println("After Sorting "+al);

	}

}
