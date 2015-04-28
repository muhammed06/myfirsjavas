
public class EvalExp {
	static Table t = new Table();
	public static void main(String[] args)
	{
		try
		{
			Stm parser = new EvalParse(System.in).parse();
			parser.eval(t);
		}catch(ParseException e)
		{
			e.printStackTrace();
		}
	}
/*	public static double eval(Exp exp, double x){
		if(exp instanceof Plus){
			return eval(((Plus)exp).exp1,x)+eval(((Plus)exp).exp2,x);
		}
		else if (exp instanceof Minus)
		{
			return eval(((Minus)exp).exp1,x)+eval(((Minus)exp).exp2,x);
		}
		else if (exp instanceof Times)
		{
			return eval(((Times)exp).exp1,x)*eval(((Times)exp).exp2,x);
		}
		else if ((exp instanceof Divide))
		{
			return eval(((Divide)exp).exp1,x)/eval(((Divide)exp).exp2,x);
		}
		else if (exp instanceof Power)
		{
			return Math.pow(eval(((Power)exp).exp1,x),eval(((Power)exp).exp2,x));
		}
		else if (exp instanceof Euler)
		{
			return Math.pow(Math.E,eval(((Euler)exp).exp1,x));
		}
		else if (exp instanceof Log)
		{
			return Math.log(eval(((Log)exp).exp1,x));
		}
		else if (exp instanceof Sqrt)
		{
			return Math.sqrt(eval(((Sqrt)exp).exp1,x));
		}
		else if (exp instanceof Sin)
		{
			return Math.sin(eval(((Sin)exp).exp1,x));
		}
		else if (exp instanceof Max)
		{
			return Math.max(eval(((Max)exp).exp1,x),eval(((Max)exp).exp2,x));
		}
		else if(exp instanceof Num)
		{
			return ((Num)exp).num;
		}
		else
		{
			return x;
		}
*/
}
