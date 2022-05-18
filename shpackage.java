import org.shape.*;
import java.util.*;

class shpackage
{
public static void main(String [] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the side of the square");
	int s=sc.nextInt();
	Square sq=new square(s);
	System.out.println("Area of square is " + sq.area());

	
	System.out.println("enter the side of the circle");
	int r=sc.nextInt();
	Square ci=new circle(s);
	System.out.println("Area of circle is " + ci.area());

	System.out.println("enter the side1 of the triangle");
	int s1=sc.nextInt();
	System.out.println("enter the side2 of the triangle");
	int s2=sc.nextInt();
	System.out.println("enter the side3 of the triangle");
	int s3=sc.nextInt();
	triangle t=new triangle(s1,s2,s3);
	System.out.println("Area of triangle is" +t.area());
}
}


