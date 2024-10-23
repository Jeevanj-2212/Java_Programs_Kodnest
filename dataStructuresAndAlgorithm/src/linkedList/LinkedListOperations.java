package linkedList;

public class LinkedListOperations {
	class Node {
		Node pl;
		int data;
		Node nl;
	}
     Node first =null;
     void insertFront(int elem) {
    	 Node newNode = new Node();
    	 newNode.data=elem;
    	 
    	 if(first==null) {
    		 newNode.pl=null;
    		 newNode.nl=null;
    		 first=newNode;
    	 }
    	 else {
    		 newNode.nl = first;  
             first.pl = newNode;   
             first = newNode;      
             first.pl = null;
    	 }
     }

}
