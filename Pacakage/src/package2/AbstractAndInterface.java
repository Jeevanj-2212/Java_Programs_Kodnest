package package2;

public class AbstractAndInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
abstract class Parent {
	abstract void fun();
}
class Child extends Parent {

	@Override
	public void fun() {
		// TODO Auto-generated method stub
		
	}	
}

interface A {
	void fun();
}
 class C implements A {

	@Override
	public void fun() {
		// TODO Auto-generated method stub
		// We can provide only public access modifer to implements class
		//because by default interface is having public and abstract
		
	}
	
}
