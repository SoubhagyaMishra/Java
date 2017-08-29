import java.util.*;
public class ReverseWord
{
	public static void main(String args[])
	{
		Scanner ss=new Scanner(System.in);
		System.out.println("Enter The Word To Reverse:");
		String s=ss.nextLine();
		String reverse="";

		System.out.println("The Reverse Word Is:");
		
		for(int i=s.length()-1;i>=0;i--)
		{
			reverse+=s.charAt(i);
		}
		System.out.println(reverse);
	}
}