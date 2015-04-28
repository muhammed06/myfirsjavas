import java.util.*;
class Tumce {
	Bolunen blnn;
	Bolen bln;
	List<Double> sonuc = new ArrayList<Double>();
	public Tumce(Bolunen a,Bolen b){blnn=a;bln=b;}
	
	public void eval(){
		int araci=0;
		sonuc.add(blnn.On.get(0));
		System.out.print("("+sonuc.get(0)+"X)^("+(blnn.On.size()-2)+") ");
		for(int i=1; i< blnn.On.size();i++)
		{
			sonuc.add(blnn.On.get(i)-sonuc.get(i-1)*bln.On.get(1));
			System.out.print("("+sonuc.get(i)+"X)^("+(blnn.On.size()-i-2)+") ");
		}
		System.out.println("");
	}
	
}

class Bolunen {
	static List<Double> On = new ArrayList<Double>();
	static List<Double> Us = new ArrayList<Double>();
	
	public Bolunen(double a,double b){On.add(a);Us.add(b);}
	public void eval(double a,double b){On.add(a);Us.add(b);}
}

class Bolen {
	static List<Double> On = new ArrayList<Double>();
	static List<Double> Us = new ArrayList<Double>();
	
	public Bolen(double a,double b){On.add(a);Us.add(b);}
	public void eval(double a,double b){On.add(a);Us.add(b);}
}
class Num {
	public double num;
	public Num(double n)
	{
		num=n;
	}
	public double eval()
	{
		return num;
	}
}