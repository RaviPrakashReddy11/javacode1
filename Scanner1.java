package basics;
import java.util.*;
public class Scanner1 
{
public static void main(String[] args) 
{
	Scanner s1=new Scanner(System.in); //System.in -> accept the request
	System.out.println("please enter your name");
	String name=s1.nextLine();
	System.out.println(name);
	System.out.println("enter your age");// System.out -> gives the result
	int age=s1.nextInt();
	System.out.println(age);
}
}
