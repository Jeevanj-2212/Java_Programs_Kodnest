package comparableInterfaces;

public class StudentComparable implements Comparable {
   String name;
   int age;
   int marks;
   public StudentComparable(String name, int age,int marks) {
	   this.name = name;
	   this.age = age;
	   this.marks = marks;
   }
   
   @Override
	public String toString() {
		// TODO Auto-generated method stub
	   return "Name: " +name+" Age: "+age+" Marks: "+marks;
		
	}

@Override
public int compareTo(Object o) {
	// TODO Auto-generated method st
	StudentComparable s = (StudentComparable)o;
	if(this.name.compareTo(s.name)>0){
		return 1 ;
	}
	else {
		return -1;
	}
	
}
}
