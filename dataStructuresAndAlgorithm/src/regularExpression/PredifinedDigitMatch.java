package regularExpression;

import java.util.Scanner;

public class PredifinedDigitMatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc  = new Scanner(System.in);
		//The next character after a can be any number of  digits
		String str= "a\\d*";
		
		String st =sc.nextLine();
		if(st.matches(str)) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}

	}

}
