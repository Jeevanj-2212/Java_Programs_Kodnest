package miscellaneous;
import java.nio.file.*;
import java.io.IOException;

public class FileInputToPrintTheSum {

	    public static void main(String[] args) {
	        String filePath = "D:\\java\\input.txt"; 
	        int sum = 0;

	        try {
	            
	            for (String line : Files.readAllLines(Paths.get(filePath))) {
	                
	                int number = Integer.parseInt(line);
	                sum += number;
	            }

	            
	            System.out.println("The sum of the numbers is: " + sum);

	        } catch (IOException e) {
	            System.out.println("Error reading the file: " + e.getMessage());
	        } catch (NumberFormatException e) {
	            System.out.println("Error parsing number: " + e.getMessage());
	        }
	    }
	}

