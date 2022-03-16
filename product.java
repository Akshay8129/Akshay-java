import java.util.Scanner;
public class product
{
	public static void main(String args[])
	{
	int x,y,p;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the first number to find the product");
	x=sc.nextInt();
	System.out.println("enter the second number");
	y=sc.nextInt();
	p=x*y;
	System.out.println("the product of "+x+" *  "+y+"=" +p);
	}
}
	