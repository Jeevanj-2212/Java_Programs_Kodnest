package regularExpression;

import java.util.Scanner;

abstract class MatchingDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc  = new Scanner(System.in);
		//The next character after a can be any number of  digits
		String str= "a[0-9]*";
		
		String st =sc.nextLine();
		if(st.matches(str)) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}

	}

}
