import java.util.Scanner;

public class trycatch 
{
		static Scanner giris = new Scanner(System.in);
	public static void main(String[] args)
	{

		try
		{
			int a=giris.nextInt();
		}
		catch(Exception e)
		{
			p("hata oluştu panpa" + e.getMessage());
		}
		finally
		{
			p("program çalıştı");
		}
	}
	public static void p(String s)
	{
		System.out.println(s);
	}
}