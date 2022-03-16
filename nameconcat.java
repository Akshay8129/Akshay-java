import java.util.Scanner;
public class nameconcat
{
	public static void main(String args[])
	{
	String x,y,z;
	Scanner nc=new Scanner(System.in);
	System.out.println("enter your first name");
	x=nc.nextLine();
	System.out.println("enter the last name");
	y=nc.nextLine();
	z=x+y;
	System.out.println("the name is" +z);
	}
}
