import java.util.*;
class complex
{
	int real,img;
complex(int real,int img){
this.real=real;
this.img=img;
}
void show(){
System.out.println("complex number="+this.real+"+"+this.img +"i");
}
public static complex add(complex n1,complex n2)
{
complex result=new complex(0,0);
result.real=n1.real+n2.real;
result.img=n1.img+n2.img;
return result;
}
public static void main(String args[]){
complex[] c=new complex[2];
Scanner sc=new Scanner(System.in);
int l_real,l_img;
for(int i=0;i<2;i++){
System.out.print("complex no"+(i+1)+"real:");
l_real=sc.nextInt();
System.out.print("complex no"+(i+1)+"img:");
l_img=sc.nextInt();
c[i]=new complex(l_real,l_img);
}
complex result=add(c[0],c[1]);
System.out.println("after addition\nresult is:");
result.show();
}
}