package basicPrograms;

import java.util.Scanner;

public class SwappingWithoutThrdVar {

	public static void main(String[] args) 
	{
		Scanner ss=new Scanner(System.in);
		System.out.println("Enter The First Number.");
		int a=ss.nextInt();
		System.out.println("Enter The Second Number.");
		int b=ss.nextInt();
		System.out.println("Before Swapping "+a+" and "+b);
		
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After Swapping "+a+" and "+b);
	}

}
