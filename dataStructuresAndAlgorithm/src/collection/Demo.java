package collection;

public class Demo<T> { 
	T item;
	void setItem(T item) {
		this.item = item;
		
	}
	void display() {
		System.out.println("Item is: "+item);
	}

}
