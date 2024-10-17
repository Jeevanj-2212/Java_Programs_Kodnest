package algorithms;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int arr[] = new int[sc.nextInt()];
		System.out.println("Enter the "+arr.length+" elements: ");
		for(int i = 0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		int arr2[] = new BubbleSort().sorted(arr);
		System.out.println("The sorted array elements are");
		
		for(int i=0;i<arr2.length;i++) {
			System.out.println(arr[i]);
		}
		

	}
	public int [] sorted(int arr[]) {
		for(int i=0;i<=arr.length-2;i++) //i=n-2;//because iteration takes this much time
		{
			for(int j=0;j<=(arr.length)-2-i;j++) //j=n-2-i; comparison of 2 elements inside each iteration 
			{
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1] = temp;
					
				}
			}
		}
		return arr;
	}

}
