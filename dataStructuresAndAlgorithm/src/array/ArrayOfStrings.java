package array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayOfStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n = sc.nextInt();
		sc.nextLine();
		String arr[] = new String[n];
		for(int i =0; i<arr.length;i++) {
			System.out.println("Enter " + (i+1) + " String");
			arr[i] = sc.nextLine();
			
		}
		System.err.println("String array is: ");
		for(String s:arr) {
			System.out.println(s);
		}
		//Below code also works similarly
		/*Arrays.stream(arr)
        .forEach(System.out::println);*/

	}

}
