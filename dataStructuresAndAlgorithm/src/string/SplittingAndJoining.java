package string;

import java.util.Scanner;

public class SplittingAndJoining {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] str1 = str.split(" ");
		String str2 = String.join("_", str1);
		System.out.println(str2);
		
	}

}
