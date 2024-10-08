package regularExpression;

import java.util.Scanner;

public class MatchingNonWhitespace {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
		//The next character after a there can not be any whitespaces 
          String str= "a\\S *";
		
		String st =sc.nextLine();
		if(st.matches(str)) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
	}
}
