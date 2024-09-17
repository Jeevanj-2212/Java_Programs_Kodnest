package innerClasses;
interface Teacher {
	void teach();
}
abstract class Electronics {
	public abstract void charge();
}

public class AnonymousInnerClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Teacher t = new Teacher() {

			public void teach() {
				// TODO Auto-generated method stub
				System.out.println("Interface Teacher is teaching");
				
			}
			
		};
		t.teach();
		Electronics c = new Electronics() {

			
			public void charge() {
				System.out.println("Abstract electronics is charging");
				
			}
			
		};
		c.charge();

	}

}
