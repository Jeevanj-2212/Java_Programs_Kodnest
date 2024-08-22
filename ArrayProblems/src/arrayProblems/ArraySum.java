package arrayProblems;

import java.util.Scanner;

public class ArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		int n2= sc.nextInt();
		int n3 = n+n2;
		int arr1[] = new int[n];
		int arr2 []= new int[n2];
		int arr3 [] = new int[n3];
		for(int k=0;k<n;k++) {
		for(int i=0;i<n;i++) {
			arr1[i] = sc.nextInt();
		}
		for(int j=0;j<n2;j++) {
			arr2[j]=sc.nextInt();
		}
		arr3[k] = arr1[i]+arr2[j];
		System.out.println(arr3[k]);
		}

	}

}
