package basics;

public class Staticwith_parameters
{
	static void add(int a, int b)
	{
		//int a = 10;
		//int b=20;
		int sum=a+b;
		System.out.println(sum);
	}
	static void login(String un,String password)
	{
		System.out.println("login successful");
	}
public static void main(String[] args)
{
	add(1,12);
	login("rahvjv", "jhjvuyyvviyv");
}
}
