package basicPrograms;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) 
	{
		Scanner ss=new Scanner(System.in);
		System.out.println("Enter The Number.");
		int num=ss.nextInt(), fact=1, k=num;
	
		//for(int i=1;i<=k;fact*=i,System.out.println("The factorial of "+num+" is :"+fact),i++);
		for(int i=1;i<=k;i++)
		{
			fact*=i;
		}
		System.out.println("The factorial of "+num+" is :"+fact);
	}

}
