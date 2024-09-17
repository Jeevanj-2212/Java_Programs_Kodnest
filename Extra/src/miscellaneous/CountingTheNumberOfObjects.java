package miscellaneous;
class Demo {
	static int count =0;
	int a;
	String b;
	{
		if(count>1) {
			System.exit(0);
			System.out.println("Only one object can be created");
		}
	}
	 {
		count++;
	}
	 

	public Demo() {
			
	}
	public Demo(int a) {
		this.a=a;
	}
	public Demo(String b) {
		this.b = b;
	}
	
	
}

public class CountingTheNumberOfObjects {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Demo d = new Demo();
		//new Demo("Java");
		//Demo c = new Demo();
		//Demo e = new Demo(9);
		
		System.out.println("Number of objects is: "+Demo.count);
		
		

	}

}
