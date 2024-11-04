package collection;

import java.util.ArrayList;

public class OverridingToString {
  public static void main(String[] args) {
	ArrayList al= new ArrayList();
	al.add(new Employee("ramu",89));
	al.add(new Employee("Bhavya",29));
	al.add(new Employee("Soniya",25));
	al.add(new Employee("Sebastian",30));
	System.out.println(al);
}
}
