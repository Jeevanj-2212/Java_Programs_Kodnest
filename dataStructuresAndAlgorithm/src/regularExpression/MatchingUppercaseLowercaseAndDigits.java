package regularExpression;

import java.util.Scanner;

public class MatchingUppercaseLowercaseAndDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc  = new Scanner(System.in);
		//The next character after a can be any number of Uppercase lowercase letters and digits
		String str= "a[a-zA-Z0-9]*";
		
		String st =sc.nextLine();
		if(st.matches(str)) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}


	}

}
