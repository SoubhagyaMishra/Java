public class Micky
	{
	public static void main(String args[])
		{
		for(int i=-40;i<=40;i++)
			{
			for(int j=-60;j<=60;j++)
				{
				if(((i-8)*(i-8))+((j-8)*(j-8))<=1000&&((i)*(i))+((j+5)*(j+5))>=60&&((i)*(i))+((j-20)*(j-20))>=60
				    &&((i-8)*(i-8))+((j-8)*(j-8))<=1000&&((i-14)*(i-14))+((j-8)*(j-8))>=80||((i+19)*(i+19))+((j+14)*(j+14))<=200&&((i+10)*(i+10))+((j+3)*(j+3))>=30
				    ||((i+19)*(i+19))+((j-30)*(j-30))<=200)
					{
					System.out.print("*");
					}
				/*else if((((i)*(i))+((j)*(j))<=1000)&&(((i)*(i))+((j)*(j))>=800))
					{
					System.out.print("&");}*/
				else{
					System.out.print(" ");
				}
				}
			System.out.println(" ");
			}
	}
	}