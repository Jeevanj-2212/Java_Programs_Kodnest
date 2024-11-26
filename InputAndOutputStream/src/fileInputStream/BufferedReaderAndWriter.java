package fileInputStream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class BufferedReaderAndWriter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String path1="D:\\java\\InputOutput\\input1.txt";
			String path2 = "D:\\java\\InputOutput\\output1.txt";
			
			FileReader fr = new FileReader (path1);
			
			FileWriter fw = new FileWriter(path2);
			
			BufferedReader br = new BufferedReader(fr);
			BufferedWriter bw = new BufferedWriter(fw);
			
			String x;
			while((x=br.readLine()) !=null) {
				bw.write(x);
			}
			bw.flush();
			}
			catch (Exception e) {
				// TODO: handle exceptioe.printe.
				e.printStackTrace();
			}

	}

}
