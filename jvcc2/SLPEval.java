import java.util.Hashtable;

public class SLPEval {
	static Table t = new Table();
	
	public static void main(String args[]) throws ParseException{
      Stm s = new Parser(System.in).Start();
      System.out.println("Parse successful");
      //System.out.println(((NumExp)((OpExp)((AStm)((CStm)s).s1).e).e2).num);
      //String x = ((IdExp)((PList)((PStm)((EseqExp)((AStm)((CStm)s).s2).e).s).el).e).id;
      //System.out.println(x);
      interpret(s);
      System.out.println();
      s.eval(t);
  }
  
  public static void interpret(Stm s) {
  	if (s instanceof CStm)
  	{
  		interpret(((CStm)s).s1);
  		interpret(((CStm)s).s2);
  	}
  	else if (s instanceof AStm)
  	{
  		double x = interpret(((AStm)s).e);
  		t.put(((AStm)s).id, x);
  	}
  	else
  	{
  		System.out.print(interpret(((PStm)s).el));
  	}
  }

  public static double interpret(Exp e) {
  	if (e instanceof IdExp)
  	{
  		return t.get(((IdExp)e).id);
  	}
  	else if (e instanceof NumExp)
  	{
  		return ((NumExp)e).num;
  	}
  	else if (e instanceof OpExp)
  	{
  		int op = ((OpExp)e).op;
  		if (op == 1)
  			return (interpret(((OpExp)e).e1)+interpret(((OpExp)e).e2));
  		else if (op == 2)
  			return (interpret(((OpExp)e).e1)-interpret(((OpExp)e).e2));
  		else if (op == 3)
  			return (interpret(((OpExp)e).e1)*interpret(((OpExp)e).e2));
  		else
  			return (interpret(((OpExp)e).e1)/interpret(((OpExp)e).e2));  			
  	}
  	else
  	{
  		interpret(((EseqExp)e).s);
  		return interpret(((EseqExp)e).e);
  	}
  }

  public static String interpret(ExpList el) {
  	if (el instanceof PList)
  	{
  		return interpret(((PList)el).e) + " " + interpret(((PList)el).el);
  	}
  	else
  	{
  		return interpret(((LList)el).e) + " ";
  	}
  }
}

class Table {
	Hashtable table;
	public Table() {
		table = new Hashtable();
	}
	
	public void put(String id, double n) {
		table.put(id, new Double(n));
	}
	
	public double get(String id) {
		return ((Double)table.get(id)).doubleValue();
	}
}