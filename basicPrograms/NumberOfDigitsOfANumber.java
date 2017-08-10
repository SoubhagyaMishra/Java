package basicPrograms;

import java.util.Scanner;

public class NumberOfDigitsOfANumber {

	public static void main(String[] args) 
	{
		Scanner ss=new Scanner(System.in);
		System.out.println("Enter The Number.");
		int num=ss.nextInt(), k=num, c=0;
		
		while(k>0)
		{
			int t=k%10;
			c++;
			k/=10;
		}
		System.out.println("The Nuimber of Digits In "+num+" Is :"+c);
	}

}
