package interfaces;

public class MainInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c = new Child();
		MainInterface.accessChild(c);
		
		

	}
	public static void accessChild(Child c) {
		c.paint();
		c.singer();
	}

}
interface Singer {
	void singer();
	
}
interface Painter {
	void paint();
}
class Child implements Singer,Painter {

	@Override
	public void paint() {
	     System.out.println("Painting");
		
	}

	@Override
	public void singer() {
		System.out.println("Singing");
		
	}
	
}
