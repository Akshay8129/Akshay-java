import java.util.*;
class prdt
{
    String pname;
    int pcode;
    int price;
    
    public prdt(String x,int y, int z) {
	pname=x;
	pcode=y;
	price=z;
}
 
} 

public class PGM18
{ 
    public static void main(String args[]) {
Scanner in = new Scanner(System.in);
System.out.print("Enter the detail of first pdt\n");
        System.out.print("Enter pname of the product: ");
        String pname1 = in.next();
	System.out.print("Enter pcode of the product: ");
        int pcode1 = in.nextInt();
        System.out.print("Enter price of the product");
        int price1 = in.nextInt();
        prdt obj1 = new prdt(pname1,pcode1,price1);

System.out.print("Enter the detail of second pdt\n");
        System.out.print("Enter pname of the product: ");
        String pname2 = in.next();
	System.out.print("Enter pcode of the product: ");
        int pcode2 = in.nextInt();
        System.out.print("Enter price of the product");
        int price2 = in.nextInt();
        prdt obj2 = new prdt(pname2,pcode2,price2);
  
System.out.print("Enter the detail of third pdt\n");
        System.out.print("Enter pname of the product: ");
        String pname3 = in.next();
	System.out.print("Enter pcode of the product: ");
        int pcode3 = in.nextInt();
        System.out.print("Enter price of the product");
        int price3 = in.nextInt();
        
  prdt obj3 = new prdt(pname3,pcode3,price3);
        

if(obj1.price<obj2.price && obj1.price<obj3.price)
    {    
        System.out.println("Product 1 has the lowest price");
    }
    else if(obj2.price<obj1.price &&obj2.price<obj3.price)
    {
        System.out.println("Product 2 has the lowest price");
    }
    else
    {
        System.out.println("Product 3 has the lowest price");

    }
    }
}