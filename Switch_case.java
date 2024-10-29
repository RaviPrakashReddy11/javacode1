package basics;
import java.util.*;
public class Switch_case
{
public static void main(String[] args)
{
	System.out.println("Press 1 for chrome:");
	System.out.println("Press 2 for IE:");
	System.out.println("Press 3 for Safari:");
	System.out.println("Press 4 for Opera mini:");
	System.out.println("Press 5 for Edge:");
	
	Scanner n1=new Scanner(System.in);
	int selection = n1.nextInt();
	
	switch(selection) // 1 means case 1 will execute
	{
	
	case 1:
		// logic go's here
		System.out.println("Launch chrome Browser");
		break; // it is advisable every case should have a break
		// if we don't have the break statement it tries to execute all the case until there is a break or end of case.
	case 2:
		System.out.println("Launch internet Explorer Browser");
		break;
	case 3:
		System.out.println("Launch Safari Browser");
		break;
	case 4:
		System.out.println("Launch opera mini Browser");
		break;
	case 5:
		System.out.println("Launch Edge Browser");
		break;
	default : //when you enter case number which is out of range, then default will print
		System.out.println("Sorry please check again");
	}
}
}
