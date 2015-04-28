import java.util.Scanner;

public class tabandonus
{
	static Scanner giris = new Scanner(System.in);
	public int onluk,i;
	//public boolean[] ikili;
	public String ikilial;
	
	public void al()
	{
		p("1 - ikiden 10 lu için\n 2 - onludan ikili için\n Seçiminiz ? :\n");
		i=giris.nextInt();
		if(i==1)
		{
			p("giriş yapınız:\n");
			ikilial=giris.next();
			iklionlu(ikilial);
		}
		else if(i==2)
		{
			p("giriş yapınız:\n");
			onluk=giris.nextInt();
			onluikili(onluk);
		}
		else
		{
			p("yanlış bir giriş yaptınız");
			al();
		}
	}
	
	public static void p(String s)
	{
		System.out.println(s);
	}
	public static void  iklionlu(String s)
	{
		;
		int uzunluk = s.length(),i,toplam=0;
		char k[] = s.toCharArray();
		for(i=0;i<uzunluk;i++)
		{
			
			if( k[i] == '1' )
			{
				
				toplam+=Math.pow(2,uzunluk-i-1);
			}
		}
		p("onluk karşılığı :  =  " + toplam);
	}
	public static void onluikili(int onlud)
	{
		String toplam="";
		int kalan;
		while(onlud!=0)
		{
			kalan = onlud % 2;
			toplam = Integer.toString(kalan) + toplam;
			onlud /=2;
		}
		
		p("dönüşüm : =  "+ toplam);
	}
}