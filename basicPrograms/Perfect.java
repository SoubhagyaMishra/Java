package basicPrograms;

import java.util.Scanner;

public class Perfect {

	public static void main(String[] args) 
	{
		Scanner ss=new Scanner(System.in);
		System.out.println("Enter The Number.");
		int x=ss.nextInt(), d=1,sum=0, y=x;
		while(x>d)
		{
			if((x%d)==0)
			{
				sum+=d;
			}
			d++;
		}
		if(sum==y)
		{
			System.out.println(x+" Is a Perfect Number.");
		}
		else
		{
			System.out.println(x+" Is Not a Perfect Number.");
		}
			
	}

}
