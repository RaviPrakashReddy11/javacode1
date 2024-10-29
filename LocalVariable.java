package basics;

public class LocalVariable
{
	static void add()
	{
		int a =100; //local variable
	}
	void sub()
	{
		int a; //declaration
		a=100; //initialization
		System.out.println(a); //utilization
		System.out.println();
		String name;
		name="ravi";
		System.out.println(name);
		
		
		String b="result will be: ->"; //local variable
	}
public static void main(String[] args)
{
	
	boolean result= false; //local variable
	LocalVariable n1=new LocalVariable();
	n1.sub();
}
}
