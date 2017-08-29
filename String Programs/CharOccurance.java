import java.util.*;
public class CharOccurance
{
	public static void main(String args[])
	{
		Scanner ss=new Scanner(System.in);
		System.out.println("Enter The String:");
		String s=ss.nextLine();
		System.out.println("Enter The Char To Count:");
		char c=ss.next().charAt(0);
		
		int count=s.length()-s.replace("a","").length();
		System.out.println("Number Of "+c+" in The Given String Is :"+count);
	}
}