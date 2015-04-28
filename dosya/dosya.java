//import java.util.Scanner;
import java.io.*;
public class dosya
{
	public static void main(String[] args)
	{
		String str;
		
		try
		{
				/*FileInputStream fstream = new FileInputStream(System.getProperty("user.dir")+"\\test.txt");
				DataInputStream sstream = new DataInputStream(fstream);
				BufferedReader breader = new BufferedReader(new InputStreamReader(sstream));
				while((str=breader.readLine())!=null)
				p(str);
				sstream.close();*/
				
				File f = new File("test.txt");
				char data[] = new char[(int)f.length()];
				FileReader FR = new FileReader(f);
				FR.read(data);
				String oku = new String(data),kapa[]=oku.split("\n");
				FR.close();
				p(kapa[0]);
		}
		catch(Exception e)
		{
			System.err.println("hata = : \n" + e.getMessage());
		}
		finally
		{
			//p("program çalıştı");
		}

		
	}
	public static void p(String s)
	{
		System.out.println(s);
	}
}