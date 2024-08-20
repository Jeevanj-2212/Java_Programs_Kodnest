package holiday;

import java.util.Scanner;

public class H10_SumOfFirstNEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		int sum =0;
		for(int i=1;i<=n;i++) {
			if(i%2==0) {
				sum+=i;
			}
		}
		System.out.println(sum);
		
		

	}

}
