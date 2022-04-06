import java.util.Scanner;
import java.lang.Math;
public class amstrong{
static void isAmstrong(int n)
{
int temp,digits=0,last=0,sum=0;
temp=n;
while(temp>0)
{
temp=temp/10;
digits++;
}
temp=n;
while(temp>0)
{
last=temp%10;
sum+=(Math.pow(last,digits));
temp=temp/10;
}
if(n==sum)
System.out.println("its amstrong");
else System.out.println("its not amstrong");
}
public static void main(String args[])
{
int num;
Scanner sc=new Scanner(System.in);
System.out.print("enter the numbers");
num=sc.nextInt();
isAmstrong(num);
}
}