	package string;
	
	import java.util.Arrays;
	import java.util.Scanner;
	
	public class Anagram {
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
	        String str1 = sc.next();
	        String str2 = sc.next();
	        System.out.println(new Anagram().anagram(str1,str2));
		}
		public boolean anagram(String str1,String str2) {
	       str1 = str1.toLowerCase();
	        str2 = str2.toLowerCase();
	        char arr1[]= str1.toCharArray();
	        char arr2[] = str2.toCharArray();
	        Arrays.sort(arr1);
	        Arrays.sort(arr2);
	         str1 =new String(arr1);
	         str2 = new String(arr2);
	         if(str1.equals(str2)) {
	        	 return true;
	         }
	         else {
	        	 return false;
	         }
		}
	
	}
