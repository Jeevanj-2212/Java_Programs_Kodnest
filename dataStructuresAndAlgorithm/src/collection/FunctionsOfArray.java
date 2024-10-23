package collection;

import java.util.ArrayList;

public class FunctionsOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList();
		al.add(50);
		al.add(20);
		al.add(30);
		System.out.println("al---->"+al);
		System.out.println("==================");
		ArrayList al2 =  new ArrayList();
		al2.add(22);
		al2.add(4);
		al2.add(24);
		al2.add(13);
		System.out.println("al2---->"+al2);
		System.out.println("==================");
		al.add(0,45);
		al.add(1,89);
		System.out.println("al---->"+al);
		System.out.println("==================");
		System.out.println(al.contains(100));
		System.out.println("al---->"+al);
		System.out.println("==================");
		al.addAll(al2);
		System.out.println("al---->"+al);
		System.out.println("==================");
		al.addAll(1,al2);
		System.out.println("al---->"+al);
		System.out.println("==================");
		System.out.println(al.containsAll(al2));
		System.out.println(al.isEmpty());
		al2.clear();
		System.out.println(al2);
		System.out.println(al.remove(2));
		System.out.println("al---->"+al);
		System.out.println("==================");
		System.out.println(al.lastIndexOf(4));
		System.out.println(al.set(0,20));
		System.out.println("al---->"+al);
		System.out.println("==================");
		

	}

}
