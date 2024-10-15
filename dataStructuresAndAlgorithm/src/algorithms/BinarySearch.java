package algorithms;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array size");
		int arr[] = new int[sc.nextInt()];
		System.out.println("Enter the array elements:");
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter the elements to be searched");
		int key = sc.nextInt();
		Arrays.sort(arr);
		System.out.println("Sorted Array: ");
		for(int i:arr) {
			System.out.println(i);
		}
		int res = new BinarySearch().binarySearch(arr, key);
		if(res==-1) {
			System.out.println("Element did not found");
		}
		else {
			System.out.println("Element found at "+res+" index.");
		}

	}
	public int binarySearch(int arr[],int key) {
		int low = 0;
		int high = arr.length-1;
		
		while(low<=high) {
			int mid =(low+high)/2;
			if(key==arr[mid]) {
				return mid;
			}
			else if(key>arr[mid]) {
				low=mid+1;
				
			}
			else {
				high = mid-1;
			}
			
		}
		return -1;
	}

}
