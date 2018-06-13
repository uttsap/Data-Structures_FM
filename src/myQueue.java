import java.util.ArrayDeque;
import java.util.Scanner;
public class myQueue<Q> {
	
		private ArrayDeque<Q> deq;
		private int front = 0;
		private int back = -1;
		
		public myQueue() {
			deq = new ArrayDeque<Q>();
			
		} 
		
		public boolean enq(Q q)
	    {
			back++;
			return deq.add(q);
	        
	    }
		
		public Q deqq() throws Exception{
			if(isEmpty())throw new Exception("Queue is empty");
			else {	       
				front--;
				deq.remove(front);
			}
			return null;
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
	    
	    public boolean isEmpty() {
	        return size() == 0;
	    }

}
