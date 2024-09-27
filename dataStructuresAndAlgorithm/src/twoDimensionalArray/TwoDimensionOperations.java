package twoDimensionalArray;
//print pde
//sum of pde
//print sde
//find abs diff of sde and pde
//addition multiplication of 2D array

import java.util.Scanner;

public class TwoDimensionOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the rows");
		int row = sc.nextInt();
		System.out.println("Enter the column:");
		int col = sc.nextInt();
		int arr1 [][] = new int[row][col];
		System.out.println("Enter the array elements");
		for(int i = 0;i<arr1.length;i++) {
			for(int j =0 ;j<arr1[i].length;j++) {
				arr1[i][j] = sc.nextInt();
			}
		}
		
		int arr2[]=new TwoDimensionOperations().findPde(arr1,row);
		for(int i=0;i<arr2.length;i++) {
			System.out.print(arr2[i]+" ");
		}

	}
	public  int [] findPde (int arr1[][],int row){
		int arr[] = new int[row];
		
		int sum=0;
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr1[i].length;j++) {
				if(i==j) {
					arr[i]=arr1[i][j];
					sum+=arr[i];
				}
			}
			System.out.println();
		}
		System.out.println("The sum of the PDE array is: " + sum);
		System.out.println("The Pde of 2D array is");
		return arr;
	}

}
