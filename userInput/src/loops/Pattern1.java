package loops;

import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for (int i = 1;i <=n;i++) {
			for(int j = 1;j<=i;j++) {
				System.out.print("*");
			}
			for(int k =i+1;k<=n+1;k++) {
				System.out.print("@");
			}
			
			System.out.println();
		}

	}

}
