package innerClasses;

public class LocalClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer3 o = new Outer3();
		o.fun1();

	}

}
class Outer3 {
    void fun1() {
		System.out.println("Outer method");
     class Inner3 {
    	void fun2() {
    		System.out.println("Inner method");
    	}
    	
     }
     Inner3 i = new Inner3();
 	i.fun2();
	}
}
