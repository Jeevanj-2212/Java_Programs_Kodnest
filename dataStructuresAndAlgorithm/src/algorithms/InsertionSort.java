package algorithms;

import java.util.Scanner;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int arr[] = new int[sc.nextInt()];
		 System.out.println("Enter "+arr.length+" elements:");
		 for (int i=0;i<arr.length;i++) {
			 arr[i] = sc.nextInt();
		 }
		 System.out.println("Array before sorting");
		 for(int i=0;i<arr.length;i++) {
			 System.out.print(arr[i]+" ");
			 
		 }
		 System.out.println();
		 new InsertionSort().insertionSort(arr);
		 System.out.println("The array element after sorting");
		 for(int i =0;i<arr.length;i++) {
			 System.out.print(arr[i]+" ");
		 }

	}
	public void insertionSort(int arr[]) {
		int item;
		for(int i =1;i<=arr.length-1;i++) {
			 item = arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>item) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1] = item;
			
		}
	}

	}


