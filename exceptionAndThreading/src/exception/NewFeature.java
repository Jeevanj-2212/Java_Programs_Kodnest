package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NewFeature {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		System.out.println("enter two numbers");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = a/b;
		System.out.println(c);
		System.out.println("Enter the array size");
		int arr[] = new int[sc.nextInt()];
		System.out.println("enter the element and position");
		int elem = sc.nextInt();
		int pos = sc.nextInt();
		arr[pos] = elem;
		System.out.println("Element is "+arr[pos]);
		

	}
		catch (ArithmeticException |ArrayIndexOutOfBoundsException|NegativeArraySizeException|InputMismatchException e) {
			System.out.println("Exception block");
			e.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
