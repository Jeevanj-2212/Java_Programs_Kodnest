package string;

import java.util.Scanner;

public class ReversingWordByWordInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		new ReversingWordByWordInString().reverseByWord(str);
		

	}
	public void reverseByWord(String str) {
		String arr[] = str.split(" ");
		String revSent="";
		for(int i =0;i<arr.length;i++) {
			String word="";
			String revWord="";
			word=arr[i];
			for(int j=word.length()-1;j>=0;j--) {
				revWord += word.charAt(j);
				
			}
			revSent = revSent+revWord+" ";
		}
		System.out.println(revSent);
		
	}

}
