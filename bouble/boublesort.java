import java.util.Scanner;

public class boublesort
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int dizi[],uzunluk,i,oyunk,dogruluk=0;
		
		
		System.out.println("Dizi uzunlugunu giriniz");
		uzunluk = input.nextInt();
		dizi = new int[uzunluk];
		System.out.println("sayilari giriniz");
		for(i=0;i<uzunluk;i++)
		{
			dizi[i]=input.nextInt();
		}
		for(;dogruluk!=(uzunluk-1);)
		{
			dogruluk=0;
			for(i=0;i<(uzunluk-1);i++)
			{
				if((dizi[i]>dizi[i+1]))
				{
					dizi[i]=dizi[i]+dizi[i+1];
					dizi[i+1]=dizi[i]-dizi[i+1];
					dizi[i]=dizi[i]-dizi[i+1];
					System.out.println(dizi[i+1]);
				}
				else
				{
					dogruluk++;
				}
			}
		}
		System.out.println("\n\nsayilar :");
		for(i=0;i<uzunluk;i++)
		{
			System.out.println(dizi[i]);
		}
	}
}







