public class StringBufferMutable
{
	public static void main(String args[])
	{
		StringBuffer sb=new StringBuffer("Java");
		StringBuffer sb1=new StringBuffer("Life");
		sb.append(sb1);
		System.out.println(sb);
		System.out.println(sb1);
	}
}
