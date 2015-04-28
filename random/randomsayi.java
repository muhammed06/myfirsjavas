import java.util.Scanner;
import java.util.Random;

public class randomsayi
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		Random random = new Random();
		int toplams,sayilar[],i,dogruluk=0;
		
		System.out.println("kac sayi uretilsin");
		toplams = input.nextInt();
		
		sayilar = new int[toplams];
		
		for(i=0;i<toplams;i++)
		{
			sayilar[i]=random.nextInt(1001);
		}
		System.out.println("sirasiz hali :");
		for(i=0;i<toplams;i++)
		{
			System.out.print(sayilar[i]+" - ");
		}
		System.out.println("");
		System.out.println("siralama :");
		for(;dogruluk!=(toplams-1);)
		{
			dogruluk=0;
			for(i=0;i<(toplams-1);i++)
			{
				if((sayilar[i]>sayilar[i+1]))
				{
					sayilar[i]=sayilar[i]+sayilar[i+1];
					sayilar[i+1]=sayilar[i]-sayilar[i+1];
					sayilar[i]=sayilar[i]-sayilar[i+1];
					System.out.print(sayilar[i+1]+" - ");
				}
				else
				{
					dogruluk++;
				}
			}
		}
		System.out.println("");
		System.out.println("sirali hali :");
		for(i=0;i<toplams;i++)
		{
			System.out.print(sayilar[i]+" - ");
		}
	}
}