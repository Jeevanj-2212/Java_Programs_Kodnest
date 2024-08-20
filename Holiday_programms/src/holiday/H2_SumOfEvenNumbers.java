package holiday;

import java.util.Scanner;

public class H2_SumOfEvenNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the starting number");
		int s= sc.nextInt();
		System.out.println("Enter the ending number");
		int e = sc.nextInt();
		int sum = 0;
		System.out.println("The sum of the even number in the given range is: ");
		for(int i=s;i<=e;i++) {
			if(i%2 == 0) {
				sum+=i;
			}
		}
		System.out.println(sum);
		

	}

}
