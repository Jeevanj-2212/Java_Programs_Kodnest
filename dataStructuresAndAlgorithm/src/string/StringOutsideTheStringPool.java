package string;

public class StringOutsideTheStringPool {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = new String("Rahul");
		String s1 = new String("Rahul");;
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
	}
}
