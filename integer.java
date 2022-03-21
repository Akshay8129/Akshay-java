import java.util.*;
public class integer
{
public static void main(String[] args)
{
int x,y,z;
Scanner in=new Scanner(System.in);
System.out.print("input the first number");
 x=in.nextInt();

System.out.print("input the second number");
 y=in.nextInt();

System.out.print("input the third number");
 z=in.nextInt();

System.out.print("the result is " +sumoftwo(x,y,z));
}
public static boolean sumoftwo (int p,int q,int r)
{
return((p+q)==r||(q+r)==p||(r+q)==q);
}
}
