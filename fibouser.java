import java.util.*;
public class fibouser{
public static void main(String[] args){
int max,prev=0,next=1;
System.out.print("how many number you want in fibonaci");
Scanner sc=new Scanner(System.in);
max=sc.nextInt();
System.out.println("fibonaci series of "+max+"numbers");
for(int i=1;i<=max;i++)
{
System.out.print(prev +"\n");
int sum=prev+next;
prev=next;
next=sum;
}
}
}