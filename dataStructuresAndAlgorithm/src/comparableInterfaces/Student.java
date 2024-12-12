package comparableInterfaces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <StudentComparable> al = new ArrayList<StudentComparable>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of students: ");
		int n = sc.nextInt();
		for(int i = 0;i<n;i++) {
			System.out.println("Enter the name of "+(i+1)+"th student");
			String name = sc.next();
			System.out.println("Enter the mark of "+(i+1)+"th student");
			int marks = sc.nextInt();
			System.out.println("Enter the age of "+(i+1)+"th student");
			int age = sc.nextInt();
			al.add(new StudentComparable(name, age, marks));
		}
		Collections.sort(al);
		System.out.println(al);
		

	}

}
