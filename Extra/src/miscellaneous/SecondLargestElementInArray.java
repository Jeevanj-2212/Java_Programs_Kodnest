package miscellaneous;

import java.util.Scanner;

public class SecondLargestElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc  = new Scanner(System.in);
		int arr[] = new int[sc.nextInt()];
		for(int i =0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		int max =arr[0];
		int sMax = arr[1];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				sMax=max;
				max=arr[i];
				if(arr[i]>sMax &&arr[i]<max) {
					sMax=arr[i];
				}
			}
			
		}
		System.out.println(sMax);

	}

}
