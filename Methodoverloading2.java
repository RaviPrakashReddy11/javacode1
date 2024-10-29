package basics;

public class Methodoverloading2
{
	void login(String emailid)
	{
		System.out.println("email is"+ emailid);
	}
	void login(long mobileno)
	{
		System.out.println("mobile number is"+ mobileno);
	}
public static void main(String[] args) 
{
	
	Methodoverloading2 n3=new Methodoverloading2();
	n3.login(584616484);
	n3.login("ravuj@sbsj");
}
}
