package loops;

import java.util.Scanner;

public class Pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		for(int i =1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				if((i==(n-2)&&j==i-1)||(i==n-1&&j==i-2)||(i==n-1&&j==i-1)) {
					System.out.print(" ");
				}
				else {
					System.out.print("*");
				}
				
			}
			System.out.println();
		}

	}

}
