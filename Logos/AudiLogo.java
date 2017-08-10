public class AudiLogo
	{
	public static void main(String asgs[])
		{
		try
			{
		for(int i=-50;i<=50;i++)
			{
			for(int j=-80;j<=80;j++)
				{
				Thread.sleep(2);
				if((i*i)+((j+40)*(j+40))<=600&&(i*i)+((j+40)*(j+40))>=460
				 ||(i*i)+((j+10)*(j+10))<=600&&(i*i)+((j+10)*(j+10))>=460
				 ||(i*i)+((j-20)*(j-20))<=600&&(i*i)+((j-20)*(j-20))>=460
				 ||(i*i)+((j-50)*(j-50))<=600&&(i*i)+((j-50)*(j-50))>=460)
					{
					System.out.print(" ");
					}
				else{
					System.out.print("$");
					}
				}
			System.out.println("");
			}}catch(Exception ee){}
		}
	}