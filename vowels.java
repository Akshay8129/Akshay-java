import java.util.*;
public class vowels{
public static void main(String[] args){
Scanner in=new Scanner(System.in);
String str=in.nextLine();
System.out.println("number of values in the string"+countvowels(str)+"\n");
}
public static int countvowels(String str)
{
int count=0;
for (int i=0;i<str.length();i++)
{
if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
{
count++;
}
}
return count;
}
}