package arrays;

import java.util.Scanner;

public class MaximumAndMinimumElementinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[5];
		System.out.println("Enter the values: ");
		Scanner sc = new Scanner(System.in);
		for(int i =0;i<5;i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("The maximum element in the array "+  max(arr));
		System.out.println("The minimum element in the array "+  min(arr));
	}

		public static int max(int arr[]) {
			int max = arr[0];
			for(int i=0;i<arr.length;i++) {
				if (arr[i] >max) {
					max = arr[i];
				}	
			}
			return max;	
	}
		public static int min(int arr[]) {
			int min = arr[0];
			for(int i=0;i<arr.length;i++) {
				if (arr[i]<min) {
					min = arr[i];
				}	
			}
			return min;	
	}

}
