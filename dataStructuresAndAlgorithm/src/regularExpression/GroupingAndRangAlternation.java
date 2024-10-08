package regularExpression;

import java.util.Scanner;

public class GroupingAndRangAlternation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//The input can be either a or b
		 String str= "a|b";
			
			String st =sc.nextLine();
			if(st.matches(str)) {
				System.out.println("true");
			}
			else {
				System.out.println("false");
			}

	}

}
