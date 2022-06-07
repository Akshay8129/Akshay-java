
import java.util.Scanner;
import java.util.HashSet;  
public class hashset
{  
   public static void main(String args[])
{  
int i,n=5;
      HashSet<Integer> hash=new HashSet<Integer>();
Scanner sc= new Scanner(System.in); 
System.out.println("enter the   first hash set\n"); 
for(i=1;i <= n;i++)
{  

      hash.add(sc.nextInt());
      
 } 

      System.out.println("\n" +hash);



 HashSet<Integer> hash1=new HashSet<Integer>();
Scanner sc1= new Scanner(System.in);  

System.out.println("enter the 2nd hash set\n");
for(i=1;i <= n;i++)
{  
      hash1.add(sc1.nextInt());
      
 } 


      System.out.println("\nsecond hash set" +hash1);
	System.out.println("second hash set is equal to second hash set: " +hash.equals(hash1));

hash1.remove(2);
System.out.println("after removing" +hash1);
System.out.println("second hash set is equal to second hash set: " +hash.equals(hash1));
}
}


 







  
     
  
      
