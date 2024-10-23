package collectionFramework;

public class ArrayOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AddDeleteInsertArray arr = new AddDeleteInsertArray(5);
		arr.insert(0, 99);
		//arr.display();
		arr.delete(0);
		arr.display();

	}

}
