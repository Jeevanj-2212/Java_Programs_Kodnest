package fileInputStream;

import java.io.File;
import java.io.IOException;

public class FileClassMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path = "D:\\java\\InputMethods\\sample.txt";
		File file = new File(path);
		System.out.println("Does File exist??"+file.exists());
		System.out.println("Is is FIle??"+file.isFile());
		System.out.println("Is it directory?"+file.isDirectory());
		System.out.println("Absolute Path: "+file.getAbsolutePath());
		System.out.println("Path: "+file.getPath());
		try {
			System.out.println("Canonical Path"+file.getCanonicalPath());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("File Name is "+file.getName());
		System.out.println("Write permission "+file.canWrite());
		System.out.println("Read permission "+file.canRead());
		System.out.println("Execute permission "+file.canExecute());
		
		

	}

}
