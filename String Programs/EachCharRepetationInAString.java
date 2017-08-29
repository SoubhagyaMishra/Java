import java.util.*;
public class EachCharRepetationInAString
{
	public static void main(String args[])
	{
		Scanner ss=new Scanner(System.in);
		System.out.println("Enter The String:");
		String s=ss.nextLine().toLowerCase();
		int count=0;		

		for(char i='a';i<='z';i++)
		{
			for(int j=0;j<=s.length()-1;j++)
			{
				if(s.charAt(j)==i)
				{
					count++;
				}
			}
			if(count!=0)
			{
				System.out.println(i+"="+count);
				count=0;
			}
		}
	}
}