package basics;
import java.util.*;
public class Scanner2
{
	static void add(int a, int b)
	{
		int sum=a+b;
		System.out.println(sum);
	}
public static void main(String[] args)
{
	Scanner s1= new Scanner(System.in);
	add(s1.nextInt(),s1.nextInt());
}
}
