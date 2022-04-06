import java.util.*;
public class paliandrome{
public static void main(String args[])
{
int size,i;
Scanner sc=new Scanner(System.in);
 System.out.println("enter a word");
String str=sc.nextLine();
size=str.length();
boolean isPaliandrome=true;
for(i=0;i<size/2;i++)
{
if(str.charAt(i)==str.charAt(size-i-1))
continue;
else
{
isPaliandrome=false;
break;
}
}
if(isPaliandrome)
System.out.println("the string "+str+"is a oaliandrome");
else
System.out.println("the string "+str+" is not a palinadrome");
}
}