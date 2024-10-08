package string;

import java.util.Scanner;

public class StringReversalUsingInbuiltMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String value");
		StringBuffer s = new StringBuffer(sc.nextLine());
		System.out.println("Before reversal");
		System.out.println(s);
		System.out.println("After reversal");
		System.out.println(s.reverse());

	}

}
