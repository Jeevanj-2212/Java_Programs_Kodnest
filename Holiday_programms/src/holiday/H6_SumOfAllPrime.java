package holiday;

import java.util.Scanner;

public class H6_SumOfAllPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int s= sc.nextInt();
		int e=sc.nextInt();
		int sum=0;
		System.out.println("The non prime numbers are: ");
		
		for(int i=s;i<=e;i++) {
			int count=0;
			for(int j=1;j<=i;j++) {
				if(i%j==0) {
					count++;
				}
			}
			if(count>2) {
				System.out.println(i+" ");
				sum+=i;
			}
			
		}
		
		System.out.println("The sum of non prime numbers in the range is: ");
		System.out.println(sum);

	}

}
