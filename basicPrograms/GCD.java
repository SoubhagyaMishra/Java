package basicPrograms;

import java.util.Scanner;

public class GCD {

	public static void main(String[] args) 
	{
		Scanner ss=new Scanner(System.in);
		System.out.println("Enter The First Number.");
		int x=ss.nextInt(), a=x;
		System.out.println("Enter The Second Number.");
		int y=ss.nextInt(), b=y, gcd=0;
		
		while(a!=0)
		{
			gcd=a;
			a=b%a;
			b=gcd;
		}
		System.out.println("Gcd of "+x+" and "+y+" is :"+gcd);
	}

}
