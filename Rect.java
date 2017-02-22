public class Rect
	{
	public static void main(String args[])
		{
		for(int i=-30;i<=30;i++)
			{
			for(int j=-30;j<=30;j++)
				{
				
				if(((i)*(j))<=0||i==30&&j>=0&&j<=30
				    ||j==30&&i>=0&&i<=30
				    ||i==-30&&j>=-30&&j<=0
				    ||j==-30&&i>=-30&&i<=0)
					{
					System.out.print("*");
					}
				else{
				System.out.print(" ");
				}
				}
			System.out.println(" ");
			}
		}
	}
		