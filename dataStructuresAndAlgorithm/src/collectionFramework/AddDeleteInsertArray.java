package collectionFramework;

public class AddDeleteInsertArray {
	private int arr[];
	public AddDeleteInsertArray(int size) {
		arr = new int[size];
		System.out.println("Array of size "+size +" created");
		
	}
	public void insert(int index, int element) {
		arr[index] = element;
		System.out.println(element +" is inserted at index "+index);
	}
	public void delete(int index) {
		arr[index]=0;
		System.out.println("Element is deleted from index: "+index);
	}
	public void display() {
		System.out.println("Array elements are:");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
