package basicPrograms;

import java.util.Scanner;

public class AddTwoNumbersWithoutPlusOperator {

	public static void main(String[] args) 
	{
		Scanner ss=new Scanner(System.in);
		System.out.println("Enter First Number.");
		int num1=ss.nextInt(), a=num1;
		System.out.println("Enter Second Number.");
		int num2=ss.nextInt(), b=num2, sum=0;
		
		for(int i=0;i<=b;i++)
		{
			sum=a+i;
		}
		
		System.out.println("The Sum Of "+num1+" and "+num2+" Is:"+sum);
	}

}
