package stack;

public class StckOperation {
	private int s[];
    int top;
    int size;
	
	StckOperation(int size){
		this.size=size;
		this.top=-1;
		
		this.s=new int[size];
		
		
	}
	 public void insert(int element) {
    	 if(top ==size-1) {
    		 System.out.println("Element cannot be inserted");
    	 }
    	 else {
    		 top++;
    		 s[top]= element;
    		 System.out.println("Element "+element+" inserted succesfully: ");
    	 }
    	 
     }
     public void delete() {
    	 if(top==-1) {
    		 System.out.println("The element cannot be deleted because stack is empty");
    	 }
    	 else {
    		 
    		 System.out.println("The element "+s[top]+" is deleted succesfully");
    		 top--;
    		 
    	 }
     }
     public void display() {
    	 if(top==-1) {
    		 System.out.println("Stack is empty");
    		
    	 }
    	 else {
    		 for(int i=top;i>=0;i--) {
    			 System.out.println(s[i]);
    		 }
    	 }
     }

}
