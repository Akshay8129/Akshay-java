import java.util.*;
public class sumdigit{
public static void main(String args[])
{ 
int m,n,sum=0;
Scanner input=new Scanner(System.in);
System.out.println("the sum of the digits is ");
m=input.nextInt();
while(m>0)

{
n=m%10;
sum=sum+n;
m=m/10;
}
System.out.print("the sum of digits are"+sum);
}
}
