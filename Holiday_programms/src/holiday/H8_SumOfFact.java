package holiday;

import java.util.Scanner;

public class H8_SumOfFact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum =0;
		Scanner sc = new Scanner(System.in);
		int fact =1;
		int n =sc.nextInt(); 
		while(n>0) {
			fact*=n;
			n--;
		}
		System.out.println(fact);
		while(fact>0) {
			int dig=fact%10;
			sum+=dig;
			fact/=10;
		}
		System.out.println(sum);
		

	}

}
