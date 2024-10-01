package miscellaneous;

import java.util.Scanner;

public class Arm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		int fin=n;
		int m=n;
		int count =0;
		int sum =0;
		
		while(n>0) {
			int digit =n%10;
			count++;
			
			n=n/10;
		}
		
		while(m>0) {
			int digit=m%10;
			sum+=Math.pow(digit, count);
			m=m/10;
		}
		
		if(fin==sum) {
			System.out.println("Armstrong Number");
		}
		else {
			System.out.println("Not Armstrong Number");
		}

	}

}
