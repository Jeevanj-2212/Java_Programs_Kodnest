package loops;

public class NestedForWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count =0;
		for (int i = 1;i<=3;i++) {
			int j = 2;
			while(j<=4) {
				int k = 3;
				do {
					count++;
					System.out.println(count +":"+i+" "+j+" "+k);
					k++;
				}while(k<=6);
				j++;
			}
		}

	}

}
