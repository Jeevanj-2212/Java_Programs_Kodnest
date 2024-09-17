package miscellaneous;
class Principal {
	private static Principal p;
	private Principal() {
		System.out.println("Principal Appointed");
	}
	public static Principal getInstance() {
		if(p==null) {
			p = new Principal();
		}
		return p;
	}
}

public class SingletonProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Principal p = new Principal(); Not working because it needs to be caleed by using getInstance
		
	      Principal p2 = Principal.getInstance();
	      Principal p3 = Principal.getInstance();
	      System.out.println((p2 == p3));
}
}