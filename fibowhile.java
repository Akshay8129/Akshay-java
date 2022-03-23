import java.util.*;
public class fibowhile{
public static void main(String[] args){
int max=10,prev=0,next=1,i=1;
System.out.print("fibonaci sreies of "+max+"numbers\n");
while(i<=max)
{
System.out.println(prev+" ");
int sum=prev+next;
prev=next;
next=sum;
i++;
}
}
}