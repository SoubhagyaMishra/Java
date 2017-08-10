package basicPrograms;

import java.util.Scanner;

public class SumOfDigitsOfANumber {

	public static void main(String[] args) 
	{
		Scanner ss=new Scanner(System.in);
		System.out.println("Enter A Number.");
		int num=ss.nextInt();
		int k=num, sum=0;
		
		while(k>0)
		{
			int t=k%10;
			sum+=t;
			k/=10;
		}
		System.out.println("The Number Of Digits In "+num+" Is :"+sum);
	}

}
