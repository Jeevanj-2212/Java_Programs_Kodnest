package array;

import java.util.Scanner;

public class SumOfTheArrayElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of the array:");
		int arr[] = new int[sc.nextInt()];
		System.out.println("Enter the value of the array:");
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Sum: "+findSum(arr));

	}
	public static int findSum(int arr[]) {
		int sum=0;
		System.out.print("Array: [");
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
			System.out.print(arr[i]);
			if(i<arr.length-1) {
				System.out.print(", ");
			}
		}
		System.out.println("]");
		return sum;
	}

}
