package algorithms;

import java.util.Scanner;

public class SelectionSort {

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
		 new SelectionSort().selectSort(arr);
		 System.out.println("The array element after sorting");
		 for(int i =0;i<arr.length;i++) {
			 System.out.print(arr[i]+" ");
		 }

	}
	public void selectSort(int arr[]) {
		int min;
		int pos;
		for(int i=0;i<arr.length-2;i++) {
			min=arr[i];
			pos=i;
			for(int j = i+1;j<=arr.length-1;j++) {
				if(arr[j]<min) {
					min = arr[j];
					pos =j;
				}
			}
			int temp=arr[i];
			arr[i]=arr[pos];
			arr[pos]=temp;
		}
	}

}
