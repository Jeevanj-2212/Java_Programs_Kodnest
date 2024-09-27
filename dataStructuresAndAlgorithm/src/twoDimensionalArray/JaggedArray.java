package twoDimensionalArray;

import java.util.Scanner;

public class JaggedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		/*arr[0] = new int[2];
		arr[1] = new int[3];
		arr[2] = new int[5];
		arr[3] = new int[1];*/
		//Removing redundancy
		System.out.println("Enter 1D length");
		int arr[][] = new int[sc.nextInt()][];
		System.out.println("Enter 2D length of each 1D");
		for(int i=0;i<arr[i].length;i++) {
			System.out.println("Enter 2D length for 1D array");
			arr[i]=new int[sc.nextInt()];
		}
		for(int i = 0;i<arr.length;i++) {
			System.out.println("Enter the elements for row " + (i+1));
			for(int j = 0;j<arr[i].length;j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println("Jagged Array");
		for(int i = 0;i<arr.length;i++) {
			for(int j = 0;j<arr[i].length;j++) {
                   System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}

	}

}
