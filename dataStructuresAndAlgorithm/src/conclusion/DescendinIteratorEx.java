package conclusion;
import java.util.*;

public class DescendinIteratorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		LinkedHashSet al = new LinkedHashSet();
		for(int i=0;i<n;i++) {
			al.add(sc.nextInt());
		}
		Iterator<Integer> itr = al.descendingIterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		

	}

}
