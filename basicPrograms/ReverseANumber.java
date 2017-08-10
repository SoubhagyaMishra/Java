package basicPrograms;

import java.util.Scanner;

public class ReverseANumber {

	public static void main(String[] args) 
	{
		Scanner ss=new Scanner(System.in);
		System.out.println("Enter The Number.");
		int x=ss.nextInt();
		int a=x, r=0;
		
		while(a>0)
		{
			int t=a%10;
			r=10*r+t;
			a/=10;
		}
		System.out.println("The Reverse of "+x+" is :"+r);
	}

}
