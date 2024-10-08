package string;

import java.util.Scanner;

public class ReversingStringWithCharAt {
   public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter the String");
	  String s = sc.nextLine();
	  char arr[] = s.toCharArray();
	  char[] arr2 = new char[arr.length];
	  int j=0;
	  for(int i = arr.length-1;i>=0;i--) {
		  arr2[j]=s.charAt(i);
		  j++;
		  
		  }
	  
	  String str=new String(arr2);
	  System.out.println(str);
	  
}
}
