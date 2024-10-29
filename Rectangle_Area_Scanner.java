package basics;
import java.util.*;
public class Rectangle_Area_Scanner
{
	void area(int l,int b)
	{
		int area=l*b;
		System.out.println(area);
	}
public static void main(String[] args)
{
	Scanner n1=new Scanner(System.in);
	System.out.println("enter length:");
	System.out.println("enter breadth");
	Rectangle_Area_Scanner n3=new  Rectangle_Area_Scanner();
	n3.area(n1.nextInt(), n1.nextInt());
	
}
}
