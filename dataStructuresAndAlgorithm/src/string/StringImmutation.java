package string;

public class StringImmutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = new String ("Rama");
		 
		String s2 =s1;
		if(s1==s2)
		{
			System.out.println("References are equal");
		}
		else {
			System.out.println("References are not equal");
		}
		
		if(s1.equals(s2)) {
			System.out.println("Strings are equal");
		}
		else {
			System.out.println("strings are not equal");
		}
		String s3 = "kodnest";
		System.out.println(s3);
		String s4= s3;
		s3 =s3.concat("tech");
		System.out.println(s3);
		System.out.println(s4);

	}
	
	
	
}
