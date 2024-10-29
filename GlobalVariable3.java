package basics;

public class GlobalVariable3
{
	String name="Ravi";
	static double ram_salary=90876.87;
	
	//static void
public static void main(String[] args)
{
	
	ram_salary=10000;
	int age=54;
	System.out.println(ram_salary);
	GlobalVariable2 n1=new GlobalVariable2();
	n1.name="Ravi Prakash";
	System.out.println(n1.name);
}
}
