package numberManipulation;

import java.util.Scanner;

public class SwappingWithoutTemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("Before swapping"+a+" "+b);
		a=(a*b)/a;
		b=(a*b)/b;
		System.out.println("After Swapping "+a+" 4"+b);
		

	}

}
