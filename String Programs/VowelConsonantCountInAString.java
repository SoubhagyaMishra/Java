import java.util.*;
public class VowelConsonantCountInAString
{
	public static void main(String args[])
	{
		Scanner ss=new Scanner(System.in);
		System.out.println("Enter The String:");
		String s=ss.nextLine().toLowerCase();
		
		int vowel=0,consonant=0;
		int size=s.length();
		char c[]=s.toCharArray();
		
		for(int i=0;i<size;i++)
		{
			if(c[i]=='a'||c[i]=='e'||c[i]=='i'||c[i]=='o'||c[i]=='u'||c[i]=='A'||c[i]=='E'||c[i]=='I'||c[i]=='O'||c[i]=='U')
			{
				vowel++;
			}
			else
			{
				consonant++;
			}
		}
		System.out.println("The Length Of The String Is:"+size);
		System.out.println("The Number Of Vowels Present Is :"+vowel);
		System.out.println("The number Of Consonants Present Is :"+consonant);
	}
}