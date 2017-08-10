package basicPrograms;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) 
	{
		Scanner ss=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=ss.nextInt();
		int count=0, b=1;
		while(b<=num)
		{
			if((num%b)==0)
			{
				count++;
			}
		b++;	
		}
		if(count==2)
		{
			System.out.println(num+" ia a Prime Number.");
		}
		else
		{
			System.out.println(num+" ia Not a Prime Number.");
		}
	}

}
