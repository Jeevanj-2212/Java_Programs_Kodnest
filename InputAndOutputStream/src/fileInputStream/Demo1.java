package fileInputStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		String path1="D:\\java\\InputOutput\\input.txt";
		String path2 = "D:\\java\\InputOutput\\output.txt";
		
		FileInputStream fis = new FileInputStream(path1);
		FileOutputStream fos = new FileOutputStream(path2);
		
		int x;
		while((x=fis.read()) !=-1) {
			fos.write(x);
		}
		}
		catch (Exception e) {
			// TODO: handle exceptioe.printe.
			e.printStackTrace();
		}
		
		

	}

}
