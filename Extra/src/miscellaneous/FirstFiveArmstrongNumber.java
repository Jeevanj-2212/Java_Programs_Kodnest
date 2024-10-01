package miscellaneous;

import java.util.Scanner;

public class FirstFiveArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of N");
		int n = sc.nextInt();
		for(int i=1;i<=n;i++) {
			int num =i;
			int temp=i;
			String s = ""+i;
			int ex= s.length();
			int sum=0;
			while(temp!=0) {
				int dig = temp%10;
				sum+=Math.pow(dig, ex);
				temp = temp/10;
				
			}
			if(num==sum) {
				System.out.println(num);
			}
		}

	}

}
