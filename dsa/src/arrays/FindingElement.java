package arrays;

import java.util.Scanner;

public class FindingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[5];
		System.out.println("Enter the values: ");
		Scanner sc = new Scanner(System.in);
		for(int i =0;i<5;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter the element to find");
		int n = sc.nextInt();
		System.out.println("The element is in the index: "+  findEle(arr,n));
	}

		public static int findEle(int arr[],int num) {
			for(int i=0;i<5;i++) {
				if (arr[i] ==num) {
					return i;
				}
				
				
				
				
			}
			return -1;
		
	}


}


