package fileInputStream;


import java.io.FileReader;
import java.io.FileWriter;

public class FileReaderAndFileWriter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String path1="D:\\java\\InputOutput\\input.txt";
			String path2 = "D:\\java\\InputOutput\\output.txt";
			
			FileReader fr = new FileReader (path1);
			
			FileWriter fw = new FileWriter(path2);
			
			int x;
			while((x=fr.read()) !=-1) {
				fw.write(x);
			}
			fw.flush();
			}
			catch (Exception e) {
				// TODO: handle exceptioe.printe.
				e.printStackTrace();
			}
			

	}

}
