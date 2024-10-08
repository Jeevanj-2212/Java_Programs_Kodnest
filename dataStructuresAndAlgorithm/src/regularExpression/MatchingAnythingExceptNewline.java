package regularExpression;

import java.util.Scanner;

public class MatchingAnythingExceptNewline {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc  = new Scanner(System.in);
		//only Single character is allowed after a
		String str= "^a.$";
		
		String st =sc.nextLine();
		if(st.matches(str)) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}


	}
}


	
