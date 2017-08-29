import java.util.*;
public class CharIndexShow
{
	public static void main(String args[])
	{
		Scanner ss=new Scanner(System.in);
		System.out.println("Enter The String:");
		String s=ss.nextLine();

		for(int i=0;i<s	.length();i++)
		{
			System.out.println("Character "+s.charAt(i)+" is at index = "+i);
		}
		System.out.println();
	}
}