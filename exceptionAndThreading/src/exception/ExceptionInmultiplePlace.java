package exception;

import java.util.Scanner;

public class ExceptionInmultiplePlace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Connection established");
		try {
			Scanner sc = new Scanner(System.in);
			
			int numerator = sc.nextInt();
			int denominator = sc.nextInt();
			int res = numerator/denominator;
			System.out.println("The quotient is : "+res);
			int arr[] = new int[sc.nextInt()];
			System.out.println("Enter Element and position To insert Elements INTO The Array");
			int elem = sc.nextInt();
			int pos = sc.nextInt();
			arr[pos] = elem;
			System.out.println("Element ath poisition "+pos+" is "+arr[pos]);
			
			}
		
		catch(Exception e) {
			System.out.println("Some Issue Occured");
		}
		System.out.println("Connection Terminated");

	}

}
