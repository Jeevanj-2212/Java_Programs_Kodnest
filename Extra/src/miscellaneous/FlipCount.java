package miscellaneous;

import java.util.Scanner;

public class FlipCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc = new Scanner(System.in);
       int s= sc.nextInt();
       String st =""+s;
       int res = countVal(st);
       System.out.println(res);
       
	}
	 public static int countVal(String st) {
		 int count=0;
		 for(int i=0;i<st.length()-1;i++) {
			 if(st.charAt(i)!=st.charAt(i+1)) {
				 count++;
			 }
		 }
		 return count;
	 }

}
