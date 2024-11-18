package collection;

import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

public class ConcurrentCollectionEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CopyOnWriteArrayList al = new  CopyOnWriteArrayList();
		al.add(86);
		al.add(48);
		al.add(18);
		al.add(99);
		al.add(30);
		for(Object x:al) {
			System.out.println(x);
			al.add(100);
		}
		System.out.println(al);

	}

}
