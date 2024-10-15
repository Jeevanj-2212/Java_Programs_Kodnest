package stringTokenizer;
enum Status{
	running,Success,failed,Pending
}
public class EnumExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Status s[]= Status.values();
		for(Status i :s) {
			System.out.println(i+":"+i.ordinal());
		}

	}

}
