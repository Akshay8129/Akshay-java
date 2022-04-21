
import java.util.*;
class Stringlength
{
 public static void main(String args[])
 {
 int i=0,n,n2;
 String str;
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter the string");
 str=sc.nextLine();
 
  n=str.length();
 
        	System.out.println("Length of the string"+n);
 
 char ch[]=str.toCharArray();
 
  n2 = ch.length;
 
        	System.out.println("Length of the string"+n2);
 }
}