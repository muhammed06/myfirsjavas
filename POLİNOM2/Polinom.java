
public class Polinom {
	public static void main(String[] args)
	{
		try
		{
			Tumce parser = new Pol(System.in).basla();
			parser.eval();
		}catch(ParseException e)
		{
			e.printStackTrace();
		}
	}
}