import java.util.*;
public class smallest{
public static void main(String[]args)
{
double x,y,z;
Scanner sc=new Scanner(System.in);
System.out.print("input the first number");
x=sc.nextDouble();
System.out.println("input the second number");
y=sc.nextDouble();
System.out.println("enter the third number");
z=sc.nextDouble();
System.out.println("the smallest value is"+Smallest(x,y,z)+"\n");
}
public static double Smallest(double x,double y,double z)
{
return Math.min(Math.min(x,y),z);
}
}