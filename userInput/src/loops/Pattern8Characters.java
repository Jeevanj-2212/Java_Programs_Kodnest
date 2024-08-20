package loops;

public class Pattern8Characters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char s='A';
		for(int i=1;i<=4;i++) {
			
			for(int j=1;j<=i;j++) {
				System.out.print(s);
			}
			s++;
			System.out.println();
		}
		char s1='C';
		for(int i =3;i>=1;i--) {
			
			for(int j=i;j>=1;j--) {
				System.out.print(s1);
			}
			
			System.out.println();
			s1--;
		}

	}

}
