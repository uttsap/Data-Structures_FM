import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.Iterator;
import java.util.Scanner;

public class myStack<E>
{
	private ArrayList<E> list;
	private int top = -1;
	public myStack() {
		list= new ArrayList();
		
	}
	
	public void push(E item) {
		list.add(item);
		top++;
		
	}
	
	public E pop() {
		if(!isEmpty()) {
			top--;
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
    public int getTop() {
    	return top;
    }
    

}
