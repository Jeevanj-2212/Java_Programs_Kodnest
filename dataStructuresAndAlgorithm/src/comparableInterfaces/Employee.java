package comparableInterfaces;

public class Employee implements Comparable {
  String name;
  int salary;
  int age;
public Employee(String name, int salary, int age) {
	
	this.name = name;
	this.salary = salary;
	this.age = age;
}
public String toString() {
	return "Name: "+name+" Salary:"+salary+" Age"+age;
}

public int  compareTo(Object o) {
	// TODO Auto-generated method stub
	Employee e = (Employee)o;
	if(this.salary>e.salary) {
		return 1;
	}
	else {
		return -1;
	}

}
  
}
