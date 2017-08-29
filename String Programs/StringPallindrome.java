import java.util.*;
public class StringPallindrome
{
	public static void main(String args[])
	{
		Scanner ss=new Scanner(System.in);
		System.out.print("Enter The String :");
		String s=ss.nextLine(),rev="";
		int size=s.length();

		for(int i=size-1;i>=0;i--)
		{
			rev+=s.charAt(i);
		}
		if(rev.equals(s))
		{
			System.out.println(s+" is a Palindrome String.");
		}
		else
		{
			System.out.println(s+" is Not an Palindrome String.");
		}
	}
}