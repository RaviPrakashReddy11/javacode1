package basics;



public class Globalvariable5
{
	int employeeid; //global variables
	double salary;
	String name;
	
	void employee_details(int employeeid,double salary,String name)
	{
		System.out.println("Hello");
	}
public static void main(String[] args)
{
	Globalvariable5 n1=new Globalvariable5();
	n1.employee_details(1011, 80987, "Ravi");
	System.out.println(n1.employeeid);
	System.out.println(n1.name);
}
}
