abstract class E {
	abstract void eval();
}

class Epar extends E{
	E epar1;
	public Epar(E a1)
	{
		epar1 =a1;
	}
	public void eval()
	{
		epar1.eval();
	}
}

class Eid extends E{
	String eusu;
	public Eid (String e1)
	{
		eusu = e1
	}	
	public void eval()
	{
		eusu.eval();
	}
}

class Enum extends E{
	double enume;
	public Enum (double e1)
	{
		enume = e1
	}	
	public void eval()
	{
		enume.eval();
	}
}

abstract class Eus {
	abstract double eval();
}

class Eartý extends Eus{
	E e1,e2;
	public Eartý(E e11,e22)
	{
		e1=e11;
		e2=e22;
	}
	public double eval()
	{
		return e1.
	}
}