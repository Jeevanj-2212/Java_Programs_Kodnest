package numberManipulation;

import java.util.Scanner;

public class PrimeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count =0;
		for (int i=1;i<=n;i++) {
			if(n%i==0)
			{
				count++;
			}
			if (count >2) {
				System.out.println("Not prime");
				return;
			}
			
		}
		if(count==2) {
			System.out.println("prime");
		}
		else {
			System.out.println("not prime");
		}
	}

}
