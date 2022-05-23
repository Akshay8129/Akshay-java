import java.util.*;
import java.util.Deque;
import java.util.ArrayDeque;  
class dequeue{  
   public static void main(String args[]){  
int i,n=5;
      ArrayDeque<String> dque=new ArrayDeque<String>();
Scanner sc= new Scanner(System.in);  
for(i=0;i <= n;i++)
{  
System.out.println("enter the   string\n");
      dque.add(sc.next());
      
 } 

      System.out.println("\n" +dque);


 System.out.println("\n" +dque.poll());
System.out.println("\n" +dque.pollFirst());
System.out.println("\n" +dque.pollLast());
System.out.println("\n" +dque.pop());

System.out.println("\n" +dque);






  
     
  
      
   }  
}