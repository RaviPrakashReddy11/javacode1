package basics;

public class ArithmaticOperators 
{
	static void add()
	{
		int a=10;
		int b=20;
		int c= a+b;
		System.out.println(c);
	}
	static void sub()
	{
		int a=10;
		int b=20;
		int c= a-b;
		System.out.println(c);
	}
	static void mul()
	{
		int a=10;
		int b=20;
		int c= a*b;
		System.out.println(c);
	}
	static void div()
	{
		int a=10;
		int b=20;
		int c= a/b;
		System.out.println(c);
	}
	static void mod()
	{
		int a=20;
		int b=40;
		int c= a%b;
		System.out.println(c);
	}
  public static void main(String[] args)
  {
	add();
	sub();
	mul();
	div();
	mod();
  }
}
