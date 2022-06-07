import java.util.*;  
class builtinop{  
   public static void main(String args[]){  
int i,n=3;
      ArrayList<String> alist=new ArrayList<String>();
Scanner sc= new Scanner(System.in); 
System.out.println("enter the   string\n"); 
for(i=0;i <= n;i++)
{  

      alist.add(sc.next());
      
 } 

      System.out.println("\n" +alist);
System.out.println("\n" +alist.size());

 System.out.println(("\n" +(alist.get(2))));

System.out.println("\n" +alist.remove(3));

System.out.println("\n" +alist);

System.out.println("\n" +alist.size());



  
     
  
      
   }  
}