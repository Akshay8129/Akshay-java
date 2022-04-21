
import java.util.*;
class strman
{
 public static void main(String args[])
 {
 String str,str1,c;
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter two string");
 str=sc.nextLine();
str1=sc.nextLine();
System.out.println("the first string is "+str);
System.out.println("the second string is "+str1);

System.out.println("the length of 1st string is "+str.length());
System.out.println("the length of 2nd string is "+str1.length());

c=str.concat(str1);
System.out.println("the concatinated string is" +c);

System.out.println("Charector at pos 2 is "+str.charAt(2));

System.out.println("index of charector s "+str.indexOf('s'));

System.out.println("Compare the strings "+str.compareToIgnoreCase(str1));

System.out.println("str to uppercase "+str.toUpperCase());

System.out.println("str to lowercase "+str1.toLowerCase());



}
}
