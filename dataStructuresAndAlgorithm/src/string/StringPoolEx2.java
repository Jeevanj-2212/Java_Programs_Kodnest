package string;

public class StringPoolEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Rama";
		String s2 = "Sita";
		String s3 = s1+s2;
		String s4 = s1+s2;
		
		String s5 = "Rama"+"Sita";
		String s6 = "Rama"+"Sita";
		//when you add strings using the references they will be present outside the string pool
		if(s3==s4) {
			System.out.println("s3 and s4 String references are equal");
		}
		else {
			System.out.println("s3 and s4 string references are not equal");
		}
		//comapring the strings
		if(s3.equals(s4)) {
			System.out.println("s3 and s4 Strings are equal");
		}
		else {
			System.out.println("s3 and s4 Strings are not eqaul");
		}
		if(s5==s6) {
			System.out.println("s5 and s6 String references are equal");
		}
		else {
			System.out.println("s5 and s6 string references are not equal");
		}
		if(s5.equals(s6)) {
			System.out.println("s5 and s6 Strings are equal");
		}
		else {
			System.out.println("s5 and s6  Strings are not eqaul");
		}

	}

}
