package holiday;

import java.util.Scanner;

public class H4_VowelsAndConsonants {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String a=sc.nextLine();
		a=a.toLowerCase();
		int count=0;
		int count1=0;
		String v=" ";
		String c= " ";
		int count3=0;
		//System.out.println(a);
		for(int i=0;i<a.length();i++) {
			if(a.charAt(i)=='a'||a.charAt(i)=='e'||a.charAt(i)=='i'||a.charAt(i)=='o'||a.charAt(i)=='u') {
				v+=a.charAt(i);
				count++;
			
			}
			else if(a.charAt(i)==' ') {
				count3++;
				
			}
			else {
				c+=a.charAt(i);
				count1++;
			}
		}
		System.out.println("Vowels are :"+v);
		System.out.println("Consonants are:"+c);
		System.out.println("The total vowels are:"+count+". \nThe total consonants are: "+count1+".\nSpaces are: "+count3+".");

	}

}
