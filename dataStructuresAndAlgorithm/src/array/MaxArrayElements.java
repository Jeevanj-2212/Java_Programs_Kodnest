package array;

import java.util.Scanner;

public class MaxArrayElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array:");
      int arr[] = new int[sc.nextInt()];
      System.out.println("Enter the array elements");
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
      System.out.println("Maximum value: " + findMax(arr));
	}
	public static int findMax(int arr[]) {
		int max = arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>max) {
				max= arr[i];
			}
		}
		return max;
	}

}
