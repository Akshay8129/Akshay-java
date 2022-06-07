import java.util.PriorityQueue; 
import java.util.Queue; 
import java.util.*;
class pqueue{  
   public static void main(String args[]){  
int i,n=5;
      Queue<String> pq=new PriorityQueue<String>();
Scanner sc= new Scanner(System.in); 
System.out.println("enter the   string\n"); 
for(i=0;i <= n;i++)
{  

      pq.add(sc.next());
      
 } 

      System.out.println("\noriginal queue\n" +pq);

     //System.out.println("\n after remove\n " +pq.remove(3));
	
      System.out.println("\n poll method \n" +pq.poll());
	
      System.out.println("\n final queue\n" +pq);
	
      System.out.println(pq.peek());
}
}