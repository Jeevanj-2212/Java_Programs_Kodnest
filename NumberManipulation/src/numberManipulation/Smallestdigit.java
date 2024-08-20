package numberManipulation;

import java.util.Scanner;

public class Smallestdigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner (System.in);
		int n = sc.nextInt();
		int var =9;
		while(n>0) {
			int digit= n%10;
			n/=10;
			if(digit<var) {
				var = digit;
			}
			
		}
		System.out.println(var);
	

	}

}
