import java.io.*;
class area 
{
	void Area(double S, double T)
	{
	System.out.println("Area of the rectangle: "+ S * T);
	}
	void Area(int S, int T)
	{
	System.out.println("Area of the rectangle: "+ S * T);
	}
}

class overload {

	public static void main(String[] args)
	{

	Rectangle obj = new Rectangle();
		obj.Area(20, 10);
		obj.Area(10.5, 5.5);
	}
}
