abstract class Stm {
	abstract void eval(Table t);
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
}

class PStm extends Stm {
	ExpList el;
	public PStm(ExpList x) {
		el = x;
	}
	public void eval(Table t) {
  		System.out.println(el.eval(t));
	}
}


abstract class Exp 
{
	public abstract double eval( Table t );
}

class Id extends Exp {
	String id;
	public Id(String x) {
		id = x;
	}
	public double eval(Table t) {
		return t.get(id);
	}
}

class Plus extends Exp {
	public Exp exp1,exp2;
	
	public Plus(Exp e1,Exp e2)
	{
		exp1=e1 ; exp2 = e2;
	}
	public double eval( Table t )
	{
		return (exp1.eval(t)+exp2.eval(t));
	}
}
class Minus extends Exp {
	public Exp exp1,exp2;
	
	public Minus(Exp e1,Exp e2)
	{
		exp1=e1 ; exp2 = e2;
	}
	public double eval( Table t )
	{
		return (exp1.eval(t)-exp2.eval(t));
	}
}
class Times extends Exp {
	public Exp exp1,exp2;
	
	public Times(Exp e1,Exp e2)
	{
		exp1=e1 ; exp2 = e2;
	}
	public double eval( Table t )
	{
		return (exp1.eval(t)*exp2.eval(t));
	}
}
class Divide extends Exp {
	public Exp exp1,exp2;
	
	public Divide(Exp e1,Exp e2)
	{
		exp1=e1 ; exp2 = e2;
	}
	public double eval( Table t )
	{
		return (exp1.eval(t)/exp2.eval(t));
	}
}

class Power extends Exp {
	public Exp exp1,exp2;
	
	public Power(Exp e1,Exp e2)
	{
		exp1=e1 ; exp2 = e2;
	}
	public double eval( Table t )
	{
		return Math.pow(exp1.eval(t),exp2.eval(t));
	}
}
class Euler extends Exp {
	public Exp exp1;
	
	public Euler(Exp e1)
	{
		exp1=e1 ;
	}
	public double eval( Table t )
	{
		return Math.pow(Math.E,exp1.eval(t));
	}
}
class Log extends Exp {
	public Exp exp1;
	
	public Log(Exp e1)
	{
		exp1=e1 ;
	}
	public double eval( Table t )
	{
		return Math.log(exp1.eval(t));
	}
}
class Sqrt extends Exp {
	public Exp exp1;
	
	public Sqrt(Exp e1)
	{
		exp1=e1;
	}
	public double eval( Table t )
	{
		return Math.sqrt(exp1.eval(t));
	}
}
class Sin extends Exp {
	public Exp exp1;
	
	public Sin(Exp e1)
	{
		exp1=e1;
	}
	public double eval( Table t )
	{
		return Math.sin(exp1.eval(t));
	}
}
class Cos extends Exp {
	public Exp exp1;
	
	public Cos(Exp e1)
	{
		exp1=e1;
	}
	public double eval( Table t )
	{
		return Math.cos(exp1.eval(t));
	}
}
class Max extends Exp {
	public Exp exp1,exp2;
	
	public Max(Exp e1,Exp e2)
	{
		exp1=e1;exp2=e2;
	}
	public double eval( Table t )
	{
		return Math.max(exp1.eval(t),exp2.eval(t));
	}
}
class Min extends Exp {
	public Exp exp1,exp2;
	
	public Min(Exp e1,Exp e2)
	{
		exp1=e1;exp2=e2;
	}
	public double eval( Table t )
	{
		return Math.min(exp1.eval(t),exp2.eval(t));
	}
}
class Num extends Exp {
	public double num;
	public Num(double n)
	{
		num=n;
	}
	public double eval( Table t )
	{
		return num;
	}
}

class Var extends Exp {
	public Var(){ }
	public double eval( Table t ) { return 1;}
}

abstract class ExpList {
	abstract String eval(Table t);
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
}

class LList extends ExpList {
	Exp e;
	public LList(Exp x) {
		e = x;
	}
	public String eval(Table t) {
		return e.eval(t) + " ";
	}
}