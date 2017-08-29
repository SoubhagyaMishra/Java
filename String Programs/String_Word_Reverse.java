import java.util.*;
public class String_Word_Reverse
{
	public static void main(String args[])
	{
		Scanner ss=new Scanner(System.in);
		System.out.println("Enter The String:");
		String s=ss.nextLine().toLowerCase();
		int size=s.length();
		char c[]=new char[size];
		char c1[]=new char[size];

		for(int i=0;i<size;i++)
		{
			c[i]=s.charAt(i);
		}
		for(int j=0;j<size;j++)
		{
			c1[j]=c[size-1-j];
		}
		String s1=new String(c1);
		System.out.println("After Reversing :"+s1);
	}
}