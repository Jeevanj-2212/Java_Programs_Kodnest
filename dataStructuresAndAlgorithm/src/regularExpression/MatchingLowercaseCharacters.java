package regularExpression;

import java.util.Scanner;

public class MatchingLowercaseCharacters {
public static void main(String[] args) {
	Scanner sc  = new Scanner(System.in);
	//The next character after a can be any number of lowercase letter
	String str= "a[a-z]*";
	
	String st =sc.nextLine();
	if(st.matches(str)) {
		System.out.println("true");
	}
	else {
		System.out.println("false");
	}
}
}
