package holiday;

import java.util.Scanner;

public class H13_PalindromeInRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		int e = sc.nextInt();
		for(int i= s ;i<=e;i++) {
			int number =i;
			int a=number;
			int sum=0;
			
			while(number>0){
				
				int digit = number%10;
				sum=sum*10+digit;
				number=number/10;
				
					
				}
			if(sum==a) {
				System.out.println(a);
			
				
			}
			
		}
		

	}

}