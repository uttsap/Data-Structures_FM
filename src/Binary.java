import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Binary {

	public static void main(String[] args) {
		 
		        Random rand = new Random();
		 
		        
		       // int rand_int1 = rand.nextInt(1000);
		        //int rand_int2 = rand.nextInt(1000);
		 
		        
		        
		      
			    Integer[] a = new Integer[100];
			    for (int i = 0; i < a.length; i++) {
			    	int arr = rand.nextInt(100);
			    	//System.out.println(arr);
			    	ArrayList list = new ArrayList();
			    	list.add(arr);
			    	Collections.sort(list);
			    	System.out.println(list);
			    
			    }
	}

	

}
