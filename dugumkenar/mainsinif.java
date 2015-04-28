


public class mainsinif
{
	public static void main(String[] args)
	{
		
		int i;
		
		kenar[] kenard = new kenar[10];
		for(i=0;i<10;i++)
		{
			kenard[i] = new kenar(i);
			kenard[i].dugumolusturbas(i);
			kenard[i].dugumolusturson(i+1);
		}
		
		for(i=0;i<10;i++)
		{
			System.out.print("->"+ kenard[i].bas.dugumno + "~" + kenard[i].kenaragir + "~" + "--->" );
		}
		
		
	}
	
}