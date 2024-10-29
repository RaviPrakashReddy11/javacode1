package basics;
import java.util.*;
public class Circle_Area_Scanner
{
	final double pi=3.14; 
	void circle(int r)
	{
		double area=pi*r*r;
		System.out.println("Area of circle is: "+ area);
	}
public static void main(String[] args)
{
	Scanner n1=new Scanner(System.in);
	Circle_Area_Scanner n2=new Circle_Area_Scanner();
	System.out.println("Enter radius:");
	n2.circle(n1.nextInt());
}
}
