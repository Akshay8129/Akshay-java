import java.util.Scanner;
public class sum
{
	public static void main(String args[])
	{
	int x,y,sum;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the first number");
	x=sc.nextInt();
	System.out.println("enter the second number");
	y=sc.nextInt();
	sum=x+y;
	System.out.println("sum is" + sum);
	}
}