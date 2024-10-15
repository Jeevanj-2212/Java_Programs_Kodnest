package algorithms;

import java.util.Scanner;

public class LinearSearchOfEmployeeObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number of employers");
		Employee empArr[] = new Employee[sc.nextInt()];
		for(int i = 0;i<empArr.length;i++) {
			System.out.println("Enter the name and age of Employee "+i);
			String name = sc.next();
			int age = sc.nextInt();
			empArr[i] = new Employee(name,age);
		}
		System.out.println("Enter the name to be searched");
		String key = sc.next();
		int res = new LinearSearchOfEmployeeObjects().search(empArr,key);
		if (res ==-1) {
			System.out.println("Name not found ");
		}
		else {
			System.out.println("Name found in the index: "+res);
		}

	}
	public int search(Employee empArr[],String key) {
		for(int i=0;i<empArr.length;i++) {
			if(key.equals(empArr[i].name)) {
				
				return i;
			}
		}
		return -1;
	}

}
