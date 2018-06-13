import java.util.ArrayDeque;
import java.util.Scanner;
public class myQueue<Q> {
	
		private ArrayDeque<Q> deq;
		
		public myQueue() {
			deq = new ArrayDeque<Q>();
			
		} 
		
		public boolean enq(Q q)
	    {
	        return deq.add(q);
	    }

	   
	    public void clear()
	    {
	        deq.clear();
	    }
	    
	    public Q peek()
	    {
	        return deq.peek();
	    }
	    
	    public boolean remove(Object o)
	    {
	        return deq.remove(o);
	    }
	    
	    public int size()
	    {
	        return deq.size();
	    }
	    
	    public String toString()
	    {
	        return deq.toString();
	    }

}
