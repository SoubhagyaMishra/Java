package basicPrograms;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) 
	{
		Scanner ss=new Scanner(System.in);
		System.out.println("Enter The Number.");
		int num=ss.nextInt();
		int k=num;
		int j=0, r=0;
		
		while(k>0)
		{
			j=k%10;
			r=10*r+j;
			k/=10;
		}
		if(r==num)
		{
			System.out.println(num+" is a Palindrome Number.");
		}
		else
		{
			System.out.println(num+" is Not a Palindrome Number.");
		}
	}

}
