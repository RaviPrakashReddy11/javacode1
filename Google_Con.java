package basics;

public class Google_Con
{
   Google_Con(int a)
   {
	   System.out.println("Constructor with para");
   }
   Google_Con()
   {
	   System.out.println("Constructor with no para");
   }
public static void main(String[] args)
{
	
	Google_Con n1=new Google_Con(); // calls constructor with no para
	Google_Con n2=new Google_Con(8);// calls constructor with para
	new Google_Con();// calls constructor with no para
	new Google_Con(1455);// calls constructor with para
}
}
