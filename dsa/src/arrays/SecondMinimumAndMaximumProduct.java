package arrays;

import java.util.Scanner;

public class SecondMinimumAndMaximumProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[5];
		System.out.println("Enter the values: ");
		Scanner sc = new Scanner(System.in);
		for(int i =0;i<5;i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("The second maximum element in the array "+  max(arr));
		System.out.println("The second minimum element in the array "+  min(arr));
		System.out.println("Product of the second largest and second smallest is: " + max(arr)*min(arr));
	}

		public static int max(int arr[]) {
			int max = arr[0];
			int second = Integer.MAX_VALUE;
			for(int i=0;i<arr.length;i++) {
				if (arr[i] >max) {
					second = max;
					max = arr[i];
				}	
				
			}
			return second;	
	}
		public static int min(int arr[]) {
			int min = arr[0];
			int secondMin = Integer.MIN_VALUE;
			for(int i=0;i<arr.length;i++) {
				if (arr[i]<min) {
					secondMin =min;
					min = arr[i];
				}	
			}
			return secondMin;	
	}

}

