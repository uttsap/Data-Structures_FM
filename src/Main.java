import java.util.ArrayList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) throws Exception {
		 myStack<Integer> st = new myStack<>();
		 myQueue<Integer> que = new myQueue<>();
		 
		 //myStack<Integer> st = new myStack<Integer>();
			//myQueue<Integer> que = new myQueue<Integer>();
			 Scanner sc=new Scanner(System.in);
			 System.out.println("Enter size of stack");
			 int si = sc.nextInt();
			 int i=0;
			 System.out.println("Enter your stack:");
			 for (i=0;i<si;i++){
			 int num = sc.nextInt();
			 st.push(num);
			 }
			 System.out.println(st);
			 System.out.println("Stack Length: " + st.size());
			 System.out.println("Peek: " + st.peek());
			// ArrayList li = new ArrayList();
			 int j=0;
			 while (j<= st.getTop()) {
			 int a = st.pop();
			 //li.add(a);
			 que.enq(a);
			 }
			// System.out.println("Stack Length: " + st.size());
			 
			 //que.enq(a);
			 que.deqq();
			 System.out.println("My Queue:" +que);
			 System.out.println("Queue Length: " + que.size());
			 System.out.println("Peek: " + que.peek());
			 //que.clear();
			 //que.remove(2);
			 
		 

	}

}
