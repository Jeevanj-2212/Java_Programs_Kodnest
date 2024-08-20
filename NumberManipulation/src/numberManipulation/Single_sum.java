package numberManipulation;

import java.util.Scanner;

public class Single_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int b=n;
		
		while(n>=10) {
			int sum =0;
			int a= n;
			while(a>0) {
				sum+=a%10;
				a /=10;
				
			}
			n=sum;
			
			
			
		
		
			
		
		}
		
		System.out.println("The single-digit sum of digits of "+b+" is "+n+".");
		

	}

}
