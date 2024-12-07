package serialization;

import java.io.Serializable;

public class Employee implements Serializable {
	//private transient int id;   //transient does not allow to serialize
	private  int id; 
	private static final long serialVersionUID = 1L;
	private int age = 22;
	private String name;
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	

}
