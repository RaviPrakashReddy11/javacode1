package basics;

public class Calling_Static_In_Mian 
{
	static void first()
	{
		System.out.println("1st method");
	}
	static void second() 
	{
		System.out.println("2nd method");
	}
	static void third()
	{
		System.out.println("3rd method");
	}
	static void fourth()
	{
		System.out.println("4th method");
	}
	static void fifth()
	{
		System.out.println("5th method");
	}
    public static void main(String[] args) 
    {
	   System.out.println("Mian method");
	   fifth();
	   third();
	   second();
	   first();
	   fourth();
    }
}
