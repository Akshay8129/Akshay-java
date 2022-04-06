import java.util.Scanner;
public class prime
{
public static void main(String args[])
{
int num,i,count=0;
Scanner sc=new Scanner(System.in);
System.out.print("enter a number:");
num=sc.nextInt();
for(i=2;i<num;i++)
{
if(num%i==0)
{
count++;
break;
}
}
if(count==0)
{
System.out.print("This is a prime number");
}
else
{
System.out.print("This is not a prime number");
}
}
}