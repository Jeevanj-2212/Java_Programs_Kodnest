package section1;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		arr[0]=0;
		arr[1]=1;
		int sum1= arr[0]+arr[1];
		for(int i =2;i<n;i++) {
			arr[i]=arr[i-1]+arr[i-2];
			 sum1+= arr[i];		
			}
		System.out.println(sum1);

	}

}
