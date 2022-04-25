import java.util.*;
class shape
{
int findarea(int l,int b)
{
return l*b;
}
float findarea(float r)
{
return(float)3.14*r*r;
}
float findarea(float base,float h)
{
return (base*h)/2;
}
int findarea(int s)
{
return s*s;
}
}

public class area{
public static void main(String args[])
{
shape o=new shape();
Scanner sc= new Scanner(System.in);

System.out.println("find area of a rectangle:");
System.out.println("enter the length:");
int l=sc.nextInt();
System.out.println("enter the breath:");
int b=sc.nextInt();
System.out.println("Area of rectangle"+o.findarea(l,b));

System.out.println("find the area of circle ");
System.out.println("enter the radius");
float r=sc.nextFloat();
System.out.println("area of circle:"+o.findarea(r));

System.out.println("find the area of triangle");
System.out.println("enter the base");
float base=sc.nextFloat();
System.out.println("enter the height");
float h=sc.nextFloat();
System.out.println("area of the triangle" +o.findarea(base,h));

System.out.println("find the area of square ");
System.out.println("enter the side");
int s=sc.nextInt();
System.out.println("the area of square"+o.findarea(s));
}
}