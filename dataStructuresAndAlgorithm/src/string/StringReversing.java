package string;

import java.util.Scanner;

public class StringReversing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str= sc.nextLine();
		/*StringBuffer s = new StringBuffer(sc.nextLine());*/
		char arr[] = str.toCharArray();
		for(int i=str.length()-1;i>=0;i--) {
			System.out.print(arr[i]);
		}

	}

}
