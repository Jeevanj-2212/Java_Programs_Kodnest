package arrays;

import java.util.Scanner;

public class PushingTheZeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[6];
		int arr2[] = new int[6];
		for(int i =0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
			
			}
		int idx =0;
		for(int i =0;i<arr.length;i++) {
			
			if(arr[i]!= 0) {
				arr2[idx] = arr[i];
				idx++;
			}
			
		}
		for(int i =0;i<arr2.length;i++) {
			System.out.println(arr2[i]);
		}
		

	}

}
