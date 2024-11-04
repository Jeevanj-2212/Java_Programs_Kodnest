package collection;

public class Generic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo<String> d = new Demo<String>();
		d.setItem("Ramu");
		d.display();
		
		Demo<Integer> i = new Demo<Integer>();
		i.setItem(55);
		i.display();
		Demo<Employee> e = new Demo<Employee>();
		e.setItem(new Employee("Bhaskar",25));
		e.display();

	}

}
