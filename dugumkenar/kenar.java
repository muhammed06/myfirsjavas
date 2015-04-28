
public class kenar
{
	public double kenaragir=0;
	public static int nesnesay=0;
	public dugum bas = new dugum();
	public dugum son = new dugum();

	/*  */
	/*  */
	/*  */
	/*  */
	
	public kenar()
	{
		nesnesay++;
	}
	public kenar(double kenaragir)
	{
		this.kenaragir= kenaragir;
		nesnesay++;
	}
	public void dugumolusturbas(int deger)
	{
		bas = new dugum(deger);
	}
	public void dugumolusturson(int deger)
	{
		son = new dugum(deger);
	}
	
}