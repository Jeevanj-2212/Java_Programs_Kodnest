package threeDimensionalArray;

public class JaggedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][][] = new int[2][][];
		arr[0] = new int[2][];
		arr[1] = new int [3][];
		
		arr[0][0]= new int[5];
		arr[0][1]= new int[3];
		
		arr[1][0]=new int[2];
		arr[1][1]=new int[4];
		arr[1][2]=new int[6];
		
		
		arr[0][0][0]=20;
		arr[0][0][1]=22;
		
		arr[1][1][0]=30;
		arr[1][1][1]=25;
		arr[1][1][2]=26;

	}

}
