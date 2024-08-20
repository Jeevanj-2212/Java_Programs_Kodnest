package numberManipulation;

import java.util.Scanner;

public class Largest_digit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner (System.in);
		int n = sc.nextInt();
		int number=n;
		largest(number);
		smallest(number);
		
	}
		public static void largest(int number) {
			int pos =1;
			int largepos=0;
			
			int var =0;
		while(number>0) {
			int digit= number%10;
			number/=10;
			
			if(digit>var) {
				var = digit;
				largepos =pos;
			}
			pos++;
			
		}
		System.out.println("Largest digit is: "+var+" present at "+largepos+" from right.");
		}
		public static void smallest(int number) {
			int pos = 1;
			int smallpos=0;
			
			int var =10;
		while(number>0) {
			int digit= number%10;
			number/=10;
			
			if(digit<var) {
				var = digit;
				smallpos = pos;
			}
			pos++;
		}
		System.out.println("Smallest digit is: "+var+" present at "+smallpos+" from right.");
		}
	

	}


