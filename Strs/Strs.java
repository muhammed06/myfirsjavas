import java.util.Scanner;

public class Strs
{

	public static Scanner giris = new Scanner(System.in);
	
	
	
	
	public static void main(String[] args)
	{
		try
		{
		/*
			String vers = "Merhaba java öğreniyorum";
			/*p("nerden alınacağını yazınız.");
			int nerden = giris.nextInt();
			char c;
			c=vers.charAt(nerden);
			p(c+"");											** /
			int bosluk= vers.indexOf(" ");
			p(bosluk + "");
			p( vers.charAt(0) + "" + vers.charAt(bosluk+1)+""+vers.charAt(vers.indexOf(" ")+1));
																		* /
			String met1="ak",met2="parti";
			met1 = met1+met2;
			p(met1);
			* /
			String a="afyonkarahisarlılaştıramadıklarımızdanmısınız",b="kahramanı";
			char[] k = b.toCharArray();
			p(k.length  +"");
			*/
			
			
		}
		catch(Exception e)
		{
			p(e.getMessage()+"");
		}
	}
	
	
	
	public static void p(String s)
	{
		System.out.println(s);
	}
}

