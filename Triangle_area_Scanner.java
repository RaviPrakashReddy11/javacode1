package basics;
import java.util.*;
public class Triangle_area_Scanner
{
	void area(int b, int h)
	{
		double area =0.5*b*h;
		System.out.println(area);
	}
public static void main(String[] args)
{
	Scanner n1=new Scanner(System.in);
	System.out.println("Enter value b:");
	System.out.println("Enter value h: ");
	Triangle_area_Scanner n2=new Triangle_area_Scanner();
	n2.area(n1.nextInt(), n1.nextInt());
}
}
