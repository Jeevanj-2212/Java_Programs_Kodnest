package string;

public class StringPool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "kodnest";
		String s1 = new String("kodnest");
		String s2 = new String("KODNEST");
		//comparing string references
		if(s==s1) {
			System.out.println("String references are equal");
		}
		else {
			System.out.println("string references are not equal");
		}
		//comapring the strings
		if(s.equals(s1)) {
			System.out.println("Strings are equal");
		}
		else {
			System.out.println("Strings are not eqaul");
		}
		if(s1==s2) {
			System.out.println("String references are equal");
		}
		else {
			System.out.println("string references are not equal");
		}
		if(s1.equals(s2)) {
			System.out.println("s1 and s2 Strings are equal");
		}
		else {
			System.out.println("s1 and s2  Strings are not eqaul");
		}
		if(s1.equalsIgnoreCase(s2)) {
			System.out.println("s1 and s2 Strings are equal if cases are ignored");
		}
		else {
			System.out.println("s1 and s2 Strings are not eqaul even if cases are ignored ");
		}
		
	

	}

}
