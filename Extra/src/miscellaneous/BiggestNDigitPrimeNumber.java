package miscellaneous;

import java.util.Scanner;

public class BiggestNDigitPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int start = sc.nextInt();
		int end = sc.nextInt();
		int large =0;
		for(int i=start;i<=end;i++) {
			if (isPrime( i)) {
				if(i>large) {
					large=i;
				}
			}
		}
System.out.println(large);
	}
	public static boolean isPrime(int n) {
		int fact =0;
		for(int i =1;i<=n;i++) {
			if(n%i==0) {
				fact++;
			}
		}
		if(fact == 2) {
			return true;
		}
		else {
			return false;
		}
	}
	

}
