package linkedList;

import java.util.LinkedList;
import java.util.Scanner;

public class LLex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		LinkedList<String> l = new LinkedList<>();
		new LLex1().op(l);

	}
public void op(LinkedList<String> l) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number of student");
	int n = sc.nextInt();
	System.out.println("Enter the student name");
	for(int i=0;i<n;i++) {
		String name = sc.next();
		l.add(name);
		
	}
	System.out.println("Please enter the student name in 2 nd position");
	String name = sc.next();
	l.add(2,name);
	l.removeFirst();
	for(String i:l) {
		System.out.println(i);
	}
}
}
