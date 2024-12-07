package serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class DeserialDemo {
	 public static void main(String[] args) {
			try {
				
				String serialPath = "D:\\java\\InputOutput\\serialization";
				FileInputStream fis = new FileInputStream(serialPath);
				ObjectInputStream ois = new ObjectInputStream(fis);
				Employee ref=(Employee)ois.readObject();
				System.out.println("Object construcetd");
				System.out.println(ref.getId()+" "+ref.getName());
				
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
	 }
}
