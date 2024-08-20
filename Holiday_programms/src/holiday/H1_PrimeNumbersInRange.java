package holiday;

import java.util.Scanner;

public class H1_PrimeNumbersInRange {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the starting number:");
		int s= sc.nextInt();
		System.out.println("Enter the ending number:");
		int e = sc.nextInt();
		System.out.println("The Prime numbers in the range are:");
		for(int i=s;i<=e;i++) {
			int count=0;
			for(int j=1;j<=i;j++) {
				if(i%j==0) {
					count++;
				}
			}
			if(count==2) {
				System.out.println(i);
			}
		}

	}

}
