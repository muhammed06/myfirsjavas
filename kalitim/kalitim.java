

public class kalitim
{
	private String ana1;
	private int ana2;
	
	public int getana2()
	{
		return ana2;
	}
	public void setana2(int ana2)
	{
		this.ana2=ana2;
	}
	public String getana1()
	{
		return ana1;
	}
	public void setana2(String ana1)
	{
		this.ana1=ana1;
	}
	
	public void yazdir()
	{
		System.out.println("bilgi 1 = " + ana1);
		System.out.println("bilgi 2 = " + ana2);
	}
	
}