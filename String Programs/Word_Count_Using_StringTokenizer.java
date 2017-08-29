import java.util.*;
public class Word_Count_Using_StringTokenizer
{
	public static void main(String args[])
	{
		int count=0;
		Scanner ss=new Scanner(System.in);
		System.out.println("Enter The String:");
		String s=ss.nextLine();
		StringTokenizer st=new StringTokenizer(s," ");

		//If Want To Print Each Word In A New Line
		while(st.hasMoreElements())
		{
			System.out.println(st.nextToken());
		}		

		//If You Want To Count How MAnt Words In The String
		/*while(st.hasMoreElements())
		{
			if(st.nextToken()!=null)
			{
				count++;
			}
		}
		System.out.println("The Number Of Words Present In The String Is :"+count);*/
		
	}
}