package basics;

public class Area_of_circle
{
	final static double pi=3.14;
	
	
	static void area1()
	{
		int r=7;
		double area=pi*r*r;
		System.out.println(area);
	}
	static void area2()
	{
		int r=17;
		double area=pi*r*r;
		System.out.println(area);
		
	}
	static void area3()
	{
		int r=25;
		double area=pi*r*r;
		System.out.println(area);
	}
	static void area4()
	{
		int r=100;
		double area=pi*r*r;
		System.out.println(area);
	}
	static void area5()
	{
		int r=1;
		double area=pi*r*r;
		System.out.println(area);
	}
	
public static void main(String[] args)
{
	area1();
	area2();
	area3();
	area4();
	area5();
}
}
