package basics;
import java.util.*;
public class Login_Scanner
{
	void login(String Fname,String Lname,String Email,String Password,String Gender,String Address,int Pincode)
	{
		System.out.println(Fname);
		System.out.println(Lname);
		System.out.println(Email);
		System.out.println(Password);
		System.out.println(Gender);
		System.out.println(Address);
		System.out.println(Pincode);
	}
public static void main(String[] args)
{
	Scanner n1=new Scanner(System.in);
	Login_Scanner n2=new Login_Scanner();
	n2.login(n1.next(), n1.next(), n1.next(), n1.next(), n1.next(), n1.next(), n1.nextInt());
}
}
