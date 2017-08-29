import java.util.*;
public class Word_Count_Using_Split
{
	public static void main(String args[])
	{
		Scanner ss=new Scanner(System.in);
		System.out.println("Enter The String :");
		String s=ss.nextLine();
		String s1[]=s.split(" ");
		System.out.println("Number Of Words In The String :"+s1.length);
		
	}
}