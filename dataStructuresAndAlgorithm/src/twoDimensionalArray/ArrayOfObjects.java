package twoDimensionalArray;

import java.util.Scanner;

public class ArrayOfObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size: ");
		Employee arr[] = new Employee[sc.nextInt()];
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter the "+i+" values");
			Employee e1=new Employee();
			System.out.println("Enter the name");
			e1.name=sc.next();
			System.out.println("Enter the ssn");
			e1.ssn=sc.nextInt();
			System.out.println("Enter the Gender");
			e1.gender=sc.next();
			System.out.println("Enter the Salary");
			e1.salary=sc.nextInt();
			arr[i]=e1;
			
		}
		/*Employee e1=new Employee();
		e1.name="Omkar";
		e1.ssn=700;
		e1.gender="male";
		e1.salary=100000;
		arr[0]=e1;
		Employee e2=new Employee();
		e2.name="Prahallad";
		e2.ssn=800;
		e2.gender="male";
		e2.salary=200000;
		arr[1]=e2;
		Employee e3=new Employee();
		e3.name="Bharadwaj";
		e3.ssn=800;
		e3.gender="male";
		e3.salary=300000;
		arr[2]=e3;
		Employee e4=new Employee();
		e4.name="Rahul";
		e4.ssn=900;
		e4.gender="male";
		e4.salary=400000;
		arr[3]=e4;
		Employee e5=new Employee();
		e5.name="Prema";
		e5.ssn=1000;
		e5.gender="female";
		e5.salary=300000;
		arr[4]=e5;*/
		System.out.print("[");
		for(int i =0;i<arr.length;i++) {
			System.out.print(arr[i].name+" "+arr[i].ssn+" "+arr[i].gender+" "+arr[i].salary);
			if(i<arr.length-1) {
				System.out.print("||");
			}
		}
		System.out.println("]");

	}

}
