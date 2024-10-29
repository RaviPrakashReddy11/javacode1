package basics;

public class Callingnonstatic_method
{
	void add()
	{
		int a=10;
		int b=20;
		int sum=a+b;
		System.out.println(sum);
	}
	void sub()
	{
		int a=10;
		int b=20;
		int sub1=a-b;
		System.out.println(sub1);
	}
public static void main(String[] args)
{
	/* classname refvariable = new classname();
	 * variable.nonstatic method()
	 */
	Callingnonstatic_method n1=new Callingnonstatic_method();
	n1.add();
	n1.sub();
	n1.add();
	n1.sub();
}
}
