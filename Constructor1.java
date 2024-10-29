package basics;

public class Constructor1
{
	 Constructor1()   // Constructor is a spl method with no returntype and its name is same as class name it is non-static.
	 
	 {
		 System.out.println("jhyfyt");
	 }
		
	 void add()
	 {
		
		 System.out.println("called add");
	 }
public static void main(String[] args)
{
	Constructor1 n1=new Constructor1();
	new Constructor1();
	new Constructor1();
//	Constructor1 n2=new Constructor1();
	
	
    n1.add();
}
}
