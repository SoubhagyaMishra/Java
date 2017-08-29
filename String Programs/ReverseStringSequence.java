import java.util.*;
public class ReverseStringSequence
{
	public static void main(String args[])
	{
		Scanner ss=new Scanner(System.in);
		System.out.println("Enter A Sentence:");
		String s=ss.nextLine();
		Stack sta=new Stack();

		StringTokenizer st=new StringTokenizer(s);
		while(st.hasMoreElements())
		{
			sta.push(st.nextElement());
		}
		System.out.println("\nOriginal String Is :\n"+s);
		System.out.println("\nReverse String Is :");

		while(!sta.empty())
		{
			System.out.print(sta.pop()+" ");
			//System.out.println(" ");	
		}
	}
}