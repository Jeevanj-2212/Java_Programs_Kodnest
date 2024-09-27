package array;

import java.util.Iterator;
import java.util.Scanner;

public class FloatArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of Players: ");
		float arr[] = new float[sc.nextInt()];
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter the height of the Player "+ (i+1));
			arr[i] = sc.nextFloat();
		}
		/*for(int i=0;i<arr.length;i++) {
			System.out.println("The height of the Player "+ (i+1)+" is");
			System.out.println(arr[i]);
		}*/
		for(float i : arr) {
			System.out.println(i+ " ");
		}
		
		

	}

}
