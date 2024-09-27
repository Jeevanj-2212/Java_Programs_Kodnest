package array;

import java.util.Scanner;

public class AverageOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int arr[]= new int[sc.nextInt()];
		System.out.println("Enter the elements of the array");
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.print("Array: [");
	      for(int i =0;i<arr.length;i++) {
	    	  System.out.print(arr[i]);
	    	  if(i<arr.length-1) {
	    		  System.out.print(", ");
	    	  }
	      }
	      System.out.println("]");
	      System.out.println("Average value: " + findAvg(arr));
		

	}
	public static int findAvg(int arr[]) {
		int avg = 0;
		for(int i=0;i<arr.length;i++) {
			avg+=arr[i];
		}
		int average = avg/arr.length;
		return average;
	}
	

}
