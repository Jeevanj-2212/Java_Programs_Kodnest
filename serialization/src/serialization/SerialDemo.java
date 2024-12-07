package serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerialDemo {
  public static void main(String[] args) {
	try {
		Employee e = new Employee(120, "Ram");
		System.out.println(e);
		String serialPath = "D:\\java\\InputOutput\\serialization";
		FileOutputStream fos = new FileOutputStream(serialPath);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(e);
		
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
}
}
