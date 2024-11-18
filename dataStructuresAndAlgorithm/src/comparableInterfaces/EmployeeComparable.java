package comparableInterfaces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;



public class EmployeeComparable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List al = new ArrayList();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of Employees:");
        int n = sc.nextInt();
        for(int i = 0;i<n;i++) {
        	System.out.println("Enter the Name of employee: ");
        	String a = sc.next();
        	System.out.println("Enter Salary:");
        	int salary = sc.nextInt();
        	System.out.println("Enter Age:");
        	int age = sc.nextInt();
        	al.add(new Employee(a,salary,age));
        }
        System.out.println("Before Sorting ");
        System.out.println(al);
        System.out.println("After sorting ");
        Collections.sort(al);
        System.out.println(al);
	}

}
