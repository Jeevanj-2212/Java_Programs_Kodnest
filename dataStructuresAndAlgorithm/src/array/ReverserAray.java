package array;

import java.util.Scanner;

public class ReverserAray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the size of the array");
		
		Result.reversedArray();

	}

}
class Result{
	
	public static void reversedArray() {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[sc.nextInt()];
		int arr1[] = new int[arr.length];
		for(int i =0;i<arr.length-1;i++) {
			arr[i] = sc.nextInt();
		}
		int j= arr.length-1;
		for(int i=0;i<=arr.length;i++) {
			arr[j] = arr[i];
			j--;
		}
	}
}
