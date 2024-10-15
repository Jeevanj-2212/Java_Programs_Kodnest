package stringTokenizer;
import java.util.Scanner;
import java.util.StringTokenizer;

public class StringTokenizerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		StringTokenizer s = new StringTokenizer(sc.nextLine());
		while(s.hasMoreTokens()) {
			System.out.println(""+s.nextToken(";"));
		}

	}

}

