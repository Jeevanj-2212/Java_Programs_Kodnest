package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class SortingHashSetElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet hs = new HashSet();
		hs.add(100);
		hs.add(50);
		hs.add(150);
		hs.add(25);
		hs.add(75);
		hs.add(125);
		hs.add(175);
		System.out.println("Before Sorting "+hs);
		ArrayList al = new ArrayList();
		al.addAll(hs);
		Collections.sort(al);
		System.out.println("After Sorting "+al);

	}

}
