package basicPrograms;

import java.util.Scanner;

public class Fibonacii {

	public static void main(String[] args) 
	{
		Scanner ss =new Scanner(System.in);
		System.out.println("Enter The Range");
		int range=ss.nextInt();
		int a=0, b=1, c=0;
		System.out.println(a+"\n"+b);
		System.out.println("\n");
		
		while(c<=range)
		{
			c=a+b;
			if(c<=range)
			{
				System.out.println(c+"\n");
				a=b;
				b=c;
			}
		}
		
	}

}
