import java.util.*;
public class swap{
public static void main(String[] args)
{
int a,b;
Scanner in=new Scanner(System.in);
System.out.print("input a number for A:");
a= in.nextInt();
System.out.print("input a number for B");
b=in.nextInt();
a=a+b;
b=a-b;
a=a-b;
System.out.println("Number in A:"+a);
System.out.println("Number in B:" +b);
}
}