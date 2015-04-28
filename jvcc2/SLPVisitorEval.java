import java.util.Hashtable;

public class SLPVisitorEval implements Visitor {
	static Table t = new Table();
	
	public static void main(String args[]) throws ParseException{
	  SLPVisitorEval visitor = new SLPVisitorEval();
      Stm s = new Parser(System.in).Start();
      
      SLPEval eval = new SLPEval();
      eval.interpret(s);
      System.out.println();
      s.eval(t);
      System.out.println();
      visitor.visit(s);
    }
  
    public void visit(Stm s) {
    	s.accept(this);
    }
	public void visit(CStm s) {
		s.s1.accept(this);
		s.s2.accept(this);
    }
	public void visit(AStm s) {
		t.put(s.id, s.e.accept(this));
    }
	public void visit(PStm s) {
		System.out.print(s.el.accept(this));
    }
	public double visit(Exp e) {
		return e.accept(this);
    }
	public double visit(IdExp e) {
		return ((Double)t.get(e.id)).doubleValue();
    }
	public double visit(NumExp e) {
		return e.num;
    }
	public double visit(OpExp e) {
		if (e.op == 1)
			return (e.e1.accept(this) + e.e2.accept(this));
		else if (e.op == 2)
			return (e.e1.accept(this) - e.e2.accept(this));
		else if (e.op == 3)
			return (e.e1.accept(this) * e.e2.accept(this));
		else
			return (e.e1.accept(this) / e.e2.accept(this));
    }
	public double visit(EseqExp e) {
		e.s.accept(this);
		return e.e.accept(this);
    }
	public String visit(ExpList el) {
		return el.accept(this);
    }
	public String visit(PList el) {
		return el.e.accept(this) + " " + el.el.accept(this);
    }
	public String visit(LList el) {
		return el.e.accept(this) + " ";
    }
}

