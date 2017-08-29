import java.util.*;
public class ASCIIValueOfCharsInAString
{
	public static void main(String args[])
	{
		Scanner ss=new Scanner(System.in);
		System.out.println("Enter The String:");
		String s=ss.nextLine();
		char c[]=s.toCharArray();

		for(int i=0;i<s.length();i++)
		{
			System.out.println(c[i]+"="+(byte)c[i]);
		}
	}
}