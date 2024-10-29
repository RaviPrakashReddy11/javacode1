package basics;

public class NonStatic_Para
{
	void add(int a,int b)
	{
		int sum=a+b;
		System.out.println(sum);
				
	}
	void sub(int a,int b)
	{
		int sub=a-b;
		System.out.println(sub);
				
	}
public static void main(String[] args)
{
	NonStatic_Para n2=new NonStatic_Para();
	n2.add(4, 100);
	n2.sub(0, 40);
}
}
