package numberManipulation;

import java.util.Scanner;

public class Nth_Term {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		int nu=sc.nextInt();
		find(nu);
		
		}
	public static void find(int nu) {
		int n=0;
	
		for(int i=1;i<=nu;i++) {
			n+=i;
			if(i==nu) {
			System.out.println("The "+nu+"th term of the series is "+n+".");
			}
		}

	}

}