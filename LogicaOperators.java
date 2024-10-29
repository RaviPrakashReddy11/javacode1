package basics;

public class LogicaOperators 
{
   public static void main(String[] args)
   {
	
	   int a=10;
	   int b=20;
	   if(!(a<6 && b==a))
	   {
		   System.out.println("hello");
	   }
	   if(!(a<6 || b==20))
	   {
		   System.out.println("bye");
	   }
   }
}
