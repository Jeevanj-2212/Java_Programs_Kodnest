package algorithms;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of array: ");
		int arr[] = new int[sc.nextInt()];
		System.out.println("Enter the elements of the array");
		for(int i =0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter the key to search");
		int key = sc.nextInt();
		int res=new LinearSearch().linearSearch(arr,key);
		if(res==-1) {
			System.out.println("Element not found");
		}
		else {
			System.out.println("The element found at index: "+res);
		}
		
		

	}
	public int linearSearch(int arr[],int key) {
		for(int i=0;i<arr.length;i++) {
			if(key==arr[i]) {
				return i;	
			}
		
		}
		return -1;
		
		}
}
