package holiday;

import java.util.Scanner;

public class H9_reverseNumberPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int l=1;
		for(int i=n;i>=1;i--) {
			for(int j=i;j<=n;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print(i+" ");
				l++;
			}
			System.out.println();
		}

	}

}
