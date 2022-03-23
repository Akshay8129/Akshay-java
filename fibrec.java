import java.util.*;
public class fibrec{
public static void main(String[] args){
int max=10;

System.out.println("fibonaci series of "+max+"numbers");
for(int i=1;i<=max;i++)
{
System.out.print(fibrec(i) +"\n");
}
}
public static int fibrec(int n)
{
if(n==0){
return 0;
}
if(n==1||n==2)
{
return 1;
}
return fibrec(n-2)+fibrec(n-1);
}
}
