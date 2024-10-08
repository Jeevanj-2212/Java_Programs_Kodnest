package regularExpression;

import java.util.Scanner;

public class QuantifierQuestonMark {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc  = new Scanner(System.in);
		//input should start with hello,in between zero or one character must be present andends with world
		String str= "^hello.?world$";
		
		String st =sc.nextLine();
		if(st.matches(str)) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
		


	}

}
