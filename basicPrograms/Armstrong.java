package basicPrograms;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) 
	{
		Scanner ss=new Scanner(System.in);
		System.out.println("Enter a Number.");
		int num=ss.nextInt();
		int k=num, sum=0;
		
		while(k>0)
		{
			int temp=k%10;
			sum=sum+(temp*temp*temp);
			k/=10;
		}
		if(num==sum)
		{
			System.out.println(num+" ia an Armstrong Number.");
		}
		else
		{
			System.out.println(num+" ia Not an Armstrong Number.");
		}
	}

}
