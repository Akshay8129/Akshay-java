public class Exp1{
	public static void main(String [] args)
{
product pa=new product();
pa.pcode="car123";
pa.pname="benz";
pa.price=10000;
System.out.println("****************displaying pa *************");
pa.display();

product pb=new product("jaguar","car426",250000);
System.out.println("****************displaying pb *************");
pb.display();

product pc=new product("bmw","car226",500000);
System.out.println("****************displaying pc *************");
pc.display();

product p = pc.getprice() <(pa.price<pb.price? pa.price:pb.price)?
pc:(pa.price<pb.price? pa:pb);

System.out.println("\n***displaying product with lowest price***");
p.display();
}
}