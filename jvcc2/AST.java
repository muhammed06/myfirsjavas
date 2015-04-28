abstract class Stm {
	abstract void eval(Table t);
	abstract void accept(Visitor v);
}

class CStm extends Stm {
	Stm s1, s2;
	public CStm(Stm x, Stm y) {
		s1 = x;
		s2 = y;
	}
	public void eval(Table t) {
		s1.eval(t);
		s2.eval(t);
	}
	public void accept(Visitor v) {
		v.visit(this);
	}
}

class AStm extends Stm {
	String id;
	Exp e;
	public AStm(String x, Exp y) {
		id = x;
		e = y;
	}
	public void eval(Table t) {
  		t.put(id, e.eval(t));
	}
	public void accept(Visitor v) {
		v.visit(this);
	}
}

class PStm extends Stm {
	ExpList el;
	public PStm(ExpList x) {
		el = x;
	}
	public void eval(Table t) {
  		System.out.print(el.eval(t));
	}
	public void accept(Visitor v) {
		v.visit(this);
	}
}

abstract class Exp {
	abstract double eval(Table t);
	abstract double accept(Visitor v);
}

class IdExp extends Exp {
	String id;
	public IdExp(String x) {
		id = x;
	}
	public double eval(Table t) {
		return t.get(id);
	}
	public double accept(Visitor v) {
		return v.visit(this);
	}
}

class NumExp extends Exp {
	double num;
	public NumExp(double x) {
		num = x;
	}
	public double eval(Table t) {
		return num;
	}
	public double accept(Visitor v) {
		return v.visit(this);
	}
}

class OpExp extends Exp {
	Exp e1, e2;
	int op;
	public OpExp(Exp x, int y, Exp z) {
		e1 = x;
		op = y;
		e2 = z;
	}
	public double eval(Table t) {
		if (op == 1)
  			return (e1.eval(t) + e2.eval(t));
  		else if (op == 2)
  			return (e1.eval(t) - e2.eval(t));
  		else if (op == 3)
  			return (e1.eval(t) * e2.eval(t));
  		else
  			return (e1.eval(t) / e2.eval(t));
	}
	public double accept(Visitor v) {
		return v.visit(this);
	}
}

class EseqExp extends Exp {
	Stm s;
	Exp e;
	public EseqExp(Stm x, Exp y) {
		s = x;
		e = y;
	}
	public double eval(Table t) {
		s.eval(t);
		return e.eval(t);
	}
	public double accept(Visitor v) {
		return v.visit(this);
	}
}

abstract class ExpList {
	abstract String eval(Table t);
	abstract String accept(Visitor v);
}

class PList extends ExpList {
	Exp e;
	ExpList el;
	public PList(Exp x, ExpList y) {
		e = x;
		el = y;
	}
	public String eval(Table t) {
		return e.eval(t) + " " + el.eval(t);
	}
	public String accept(Visitor v) {
		return v.visit(this);
	}
}

class LList extends ExpList {
	Exp e;
	public LList(Exp x) {
		e = x;
	}
	public String eval(Table t) {
		return e.eval(t) + " ";
	}
	public String accept(Visitor v) {
		return v.visit(this);
	}
}


