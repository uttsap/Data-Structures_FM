import java.util.ArrayList;

import java.util.Collections;
import java.util.Random;
import java.util.Scanner;
class makeTree{
	
	
	ArrayList<Integer> list;
	public makeTree(ArrayList<Integer> list) {
		this.list=list;
	}
	//public void getMid() {
       // System.out.println("Sorted List:" + this.list);
      //  
       // System.out.println(mid);
	//}
	
	public boolean binarySearch(int key)
    {	
		
		
		//int key = 56;
		int first = 0;
		int last = this.list.size() - 1;
		while (true) {
			int mid = first + (last - first)/2;
			if(first > last) {
			    return false;

			}
			
		    if (mid == key ) {
		    	return true;
		    } else if (mid > key) {
		    	last = mid - 1;
		    } else {
		    	first = mid + 1;
		    }
		}

	}
}
public class Binary {

	public static void main(String[] args) {
		
		        ArrayList<Integer> numbers = new ArrayList<Integer>();
		        int  num = 100; 
		        Random random = new Random();

		        do
		        {
		            int next = random.nextInt(100);
		            if (!numbers.contains(next))
		            {
		                numbers.add(next);
		                
		            }
		        } while (numbers.size() < num);
		      //  Collections.sort(numbers);
		        //System.out.println(numbers);
		        Collections.sort(numbers);
		        System.out.println(numbers);
		        Scanner sc=new Scanner(System.in);
				System.out.println("Enter a key");
				int key = sc.nextInt();
				sc.close();
		        
		        makeTree tree = new makeTree(numbers);
		       // tree.getMid();
		        if(tree.binarySearch(key)) {
		        	System.out.println("Item found");
		        }
		        else System.out.println("Not found");
		        
		    }
}

		
		
		

