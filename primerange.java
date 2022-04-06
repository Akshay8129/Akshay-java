import java.util.Scanner;
public class primerange
{
public static void main(String args[])
{
int m,n,num,j,i,count;
System.out.println("enter enter 2 limits:");
Scanner sc=new Scanner(System.in);
m=sc.nextInt();
n=sc.nextInt();
System.out.print("prime numbers between:"+m+" to "+n+" are");
for(j=m;j<=n;j++)
{
count=0;
for(i=1;i<=j;i++)
{
if(j%i==0)
{
count++;
}
}
if(count==2)
System.out.print(j+ " ");
}
}
}