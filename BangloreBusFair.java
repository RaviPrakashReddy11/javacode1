package basics;

public class BangloreBusFair
{
	public static void main(String[] args)
	{
		char gender1='F';
		char gender2='M';
		int age=43;
		if(gender1=='M')
		{
			System.out.println("BUS IS FREE FOR WOMEN");
			
		}
		else
		{
			
			if(age<=2)
			{
				System.out.println("Free for infant");
			}
			else if(age>2 && age<=12)
			{
				System.out.println("Half Price");
			}
			else if(age>12 && age<=50)
			{
				System.out.println("Full price for adult");
			}
			else
			{
				System.out.println("Free for senior citizen");
			}
		}
		
		
	}

}
