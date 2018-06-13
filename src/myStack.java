import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.Scanner;

public class myStack<E>
{
	private ArrayList<E> list;
	
	public myStack() {
		list= new ArrayList();
		
	}
	
	public void push(E item) {
		list.add(item);
		
	}
	
	public E pop() {
		if(!isEmpty()) {
			return list.remove(size()-1);
		} else throw new EmptyStackException();
		
	}
	
	public boolean isEmpty() {
        return size() == 0;
    }

    public E peek() {
        return list.get(size() - 1);
    }
      
    public int size() {
    	return list.size();
    
    }
    
    public String toString() {
    	  return "MyStack=" + list.toString();
    	 }
    

	public static void main(String[] args) {
		myStack<Integer> st = new myStack<Integer>();
		 System.out.println("Stack Length: " + st.size());
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter ");
		 int i=0;
		 for (i=0;i<5;i++){
		 int num = sc.nextInt();
		 st.push(num);
		 
		 }
		 System.out.println(st);
		 System.out.println("Peek: " + st.peek());
		 
		
			
	}

}
