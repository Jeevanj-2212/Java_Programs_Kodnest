package collection;

import java.util.WeakHashMap;

public class WeakHashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student(123, "Sunil", 25);
		Student s2 = new Student(133, "Suraj", 22);
		Keys key1 = new Keys(100);
		Keys key2 = new Keys(200);
		WeakHashMap hm = new WeakHashMap();
		hm.put(key1, s1);
		hm.put(key2, s2);
		System.out.println(hm);
		key1 = null;
		System.gc();
		
		for(int i =0;i<=500;i++) {// to understand the working of garbage collector
			System.out.print("");
			if(i==500) {
				System.out.println();
				System.out.print("Done");
			}
		}
		System.out.println();
		System.out.println(hm);

	}

}
