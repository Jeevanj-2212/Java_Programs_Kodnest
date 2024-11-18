package comparableInterfaces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List al = new ArrayList();
		al.add(50);
		al.add(100);
		al.add(150);
		al.add(25);
		al.add(75);
		al.add(125);
		al.add(175);
		System.out.println("Before sorting");System.out.println(al);
		System.out.println("After sorting");
		Collections.sort(al);
		System.out.println(al);

	}

}
