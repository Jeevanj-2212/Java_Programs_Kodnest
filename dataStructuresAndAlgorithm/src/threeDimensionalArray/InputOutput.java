package threeDimensionalArray;

import java.util.Scanner;

public class InputOutput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first dimension");
		int n = sc.nextInt();
		System.out.println("Enter the Second dimension");
		int m = sc.nextInt();
		System.out.println("Enter the third dimension");
		int o = sc.nextInt();
		int arr[][][] = new int[n][m][o];
		for(int i =0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				for(int k=0;k<arr[i][j].length;k++) {
					arr[i][j][k] = sc.nextInt();
				}
			}
		}
		System.out.println("Array elements are");
		for(int i =0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				for(int k=0;k<arr[i][j].length;k++) {
					System.out.print(arr[i][j][k]+" "); 
				}
				System.out.println();
			}
			System.out.println("-----------------------");
		}
	
		

	}

}
