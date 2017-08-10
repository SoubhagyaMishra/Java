package basicPrograms;

import java.util.Scanner;

public class NpX {

	public static void main(String[] args) 
	{
		Scanner ss=new Scanner(System.in);
		System.out.println("Enter The Value Of n");
		int n=ss.nextInt();
		System.out.println("Enter The Value Of x");
		int x=ss.nextInt(), pow=1;
		
		for(int i=0;i<x;i++)
		{
			pow*=n;
		}
		System.out.println("Power= "+pow);
	}

}
