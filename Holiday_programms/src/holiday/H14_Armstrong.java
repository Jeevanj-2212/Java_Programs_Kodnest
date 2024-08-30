package holiday;

import java.util.Scanner;

public class H14_Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the starting range:");
		int s = sc.nextInt();
		System.out.println("Enter the ending:");
		int e = sc.nextInt();
		
		for(int i=s;i<=e;i++) {
			int count =0;
			int sum =0;
			int a =i;
			int b = i;
			while(a>0) {
				
				
				a =a/10;
				count++;
			}
			while(b>0) {
				int dig = b%10;
				
				sum += Math.pow(dig, count);
				b=b/10;
			}
			if(sum==i) {
				System.out.println(i);
			}
			
			
		}

	}

}
