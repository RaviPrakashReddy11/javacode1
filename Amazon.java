package basics;

public class Amazon 
{
	static void add(int a, double b)
	{
		double sum=a+b;
		System.out.println(sum);
	}
	static void sub(float a, double b)
	{
		double sub=a-b;
		System.out.println(sub);
	}
	static void sub(int a, double b)
	{
		double sub=a-b;
		System.out.println(sub);
	}
	void add()
	{
		System.out.println("created a ststic with no args");
	}
	void add(int a, long b)
	{
		System.out.println(a+b);
		System.out.println("created a ststic with a args");
	}
	void add(float a, long b)
	{
		System.out.println(a+b);
		System.out.println("created a ststic with a args");
	}
	Amazon()
	{
		System.out.println("Created a constructor");
	}
	Amazon(int a)
	{
		System.out.println("Created a with para constructor");
	}
	Amazon(float a)
	{
		System.out.println("Created a with para constructor");
	}
public static void main(String[] args)
{
	Amazon n1=new Amazon();
	n1.add();
	n1.add(2.457f, 1458759451l);
	n1.add(5, 14);
	add(4, 2.568155);
	sub(5.872f, 9.87546214);
	sub(5, 8.124758);
	new Amazon(8);
	new Amazon(5.241f);
	
}
}
