package holiday;

import java.util.Scanner;

public class H12_SumOfSquaresOfEvenNUmber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int s = sc.nextInt();
		int e = sc.nextInt();
		int sq=0;
		for(int i=s;i<=e;i++) {
			if(i%2==0) {
				sq+=i*i;
			}
		}
		System.out.println(sq);

	}

}
