import java.io.*;
import java.util.*;

public class dosyayaz
{
	public static void main(String[] args)
	{
		File f = new File("deneme.txt");
		dosyaolustur(f);
		//dosyasil(f);
		dosyaoku(f);
		dosyayaz(f,"bu batan ilk gemi\n");
		p(dosyasatiral(f));
	}
	public static String dosyasatiral(File f)
	{
		String a[]=new String[1];
		boolean ife[]= new boolean[1];
		try
		{
			Scanner sc = new Scanner(f);
			
			ife[0] = sc.hasNextLine();
			if(ife[0]) a[0] =  sc.nextLine();
			sc.close();
		}
		catch(Exception e)
		{
			System.err.println(e.getMessage());
		}
			if(ife[0])
				return a[0];
			else
				return "";
	}
	public static void dosyayaz(File f,String yazi)
	{
		try
		{
            // Dosyaya yazmak için nesnemizi oluşturuyoruz.
            FileOutputStream fos = new FileOutputStream(f);
            //Yazma işlemini gerçekleştiriyoruz.
            fos.write(yazi.getBytes());
            fos.flush();
            // İşlemimiz bitince kaynaklarımızı kapatıyoruz. Boşuna sistemde hazır beklemesinler.
            fos.close();
        }
		catch(Exception e)
		{
			System.err.println(e.getMessage()+" hatası var\n");
		}
	}
	public static void dosyasil(File f)
	{
		if(!f.exists())
		{
			p("dosya olmadığından silinemedi\n");
		}
		else
		{
			f.delete();
			p(f.getName() + "  dosyası silindi\n");
		}
	}
	public static void p(String s)
	{
		System.out.println(s);
	}
	public static void dosyaolustur(File f)
	{
		try
		{
			if(!f.exists())
			{
				f.createNewFile();
				p(f.getName() + " Adlı dosya oluşturuldu:\n");
			}
			else
			{
				p("dosya olduğundan oluşturulmadı:\n");
			}
		}
		catch(Exception e)
		{
			System.err.println(e.getMessage());
		}
	}
	public static void dosyaoku(File f)
	{
		try 
		{
			FileInputStream fis = new FileInputStream(f); // dosya okumak için çağırıyoruz
			int dosyaBoyutu = (int) f.length(); // txt uzantılı dosyalar da her karakter 1 byte yer kaplar
												// bu yüzden uzunluğu alarak metnin uzunluğunu da bulmuş oluyoruz
			System.out.println("Dosya uzunluğu : "+ dosyaBoyutu); // ekrana dosya uzunluğunu yazdırıyoruz.
			for (int i = 0; i < dosyaBoyutu; i++) 
			{ // dosyamızın her karakterini okuyoruz.
				System.out.print((char)fis.read()); // ekrana yazdırıyoruz.
			}
			fis.close(); // dosya okuma işlemimiz bittikten sonra kapatıyoruz.
		}
		catch(Exception e)
		{
			System.err.println(e.getMessage());
		}
    }
}