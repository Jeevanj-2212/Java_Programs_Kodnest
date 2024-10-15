package string;

import java.util.Scanner;

public class ReversingByPreservingSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str = sc.nextLine();
		System.out.println("Original String");
		System.out.println(str);
		new ReversingByPreservingSpaces().reverse(str);

	}
	public void reverse(String str) {
		char arr[] =str.toCharArray();
		char arr1[] = new char[arr.length];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==' ') {
				arr1[i] = arr[i];
			}
		}
		int j = arr1.length-1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=' ')
				
			{
				if(arr1[j]==' ') {
					j--;
				}
				arr1[j]=arr[i];
				j--;
				
			}
			
		}
		String str2 = new String(arr1);
		
		System.out.println("Reversed String is");
		System.out.println(str2);
		if(str.equals(str2)) {
			System.out.println(str+" is palindrome");
		}
		else {
			System.out.println(str+" is Not palindrome");
		}
	}

}
