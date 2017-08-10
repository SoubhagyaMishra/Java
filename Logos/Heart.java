public class Heart
        {
        public static void main(String args[])
                {
                for(int i=-30;i<=30;i++)
                        {
                        for(int j=-70;j<=70;j++)
                                {
                                if((i*i)+(j*j)<=200
                                   ||((i)*(i)+(j-20)*(j-20)<=200)
		   ||((i-12)*(i-12)+(j-3)*(j-3)<=40)
		   ||((i-12)*(i-12)+(j-17)*(j-17)<=40)
		   ||((i-16)*(i-16)+(j-10)*(j-10)<=50)
		   ||(j==20&&i>=(i-25)&&i<=(i-25)))
                                        {
                                        System.out.print("*");
                                        }
                                else
                                        {
                                        System.out.print(" ");
                                        }
                                }
                           System.out.println();
                           }
                           }
                           }
                          
