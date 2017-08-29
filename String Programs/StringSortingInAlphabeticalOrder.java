import java.util.*;
public class StringSortingInAlphabeticalOrder
{
	public static void main(String args[])
	{
		Scanner ss=new Scanner(System.in);
		System.out.println("Enter The String:");
		String s=ss.nextLine();
		char arr[]=s.toCharArray();
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				if(arr[j]>arr[i])
				{
					char temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("String In SortingOrder Is :");
		for(int k=0;k<arr.length;k++)
		{
			System.out.println(arr[k]);
		}
	}
}


/*Or We Can Use Arrays Class Of Util PAckage To Sort The Same*/

/*
import java.util.*;
import java.io.*;
public class Sort_Alphabetically
{
	public static void main(String args[])
	{
		Scanner ss=new Scanner(System.in);
		System.out.println("Please Enter The Word:");
		String s=ss.nextLine().toLowerCase();
		
		char[] content=s.toCharArray();
		Arrays.sort(content);
		System.out.println(content);
	}
}
*/