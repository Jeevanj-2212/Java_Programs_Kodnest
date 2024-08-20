package numberManipulation;

import java.util.Scanner;

public class Fiboncci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the value of n");
		int fib1=0;
		int fib2=1;
		int n = sc.nextInt();
		System.out.print("Fibonacci series : ");
		if(n==1) {
			System.out.print(fib1);
			
		}
		else if(n==2) {
			System.out.print(fib1+" "+fib2+" ");
		}
		else if(n==0) {
			System.out.println("Invalid");
		}
		else {
			System.out.print(fib1+" "+fib2+" ");
			for(int i=3;i<=n;i++) {
				int fib3=fib1+fib2;
				fib1 = fib2;
				fib2=fib3;
				System.out.print(fib3+" ");
			}
			
		}

	}

}
