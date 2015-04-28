interface Visitor {
	public void visit(Stm s);
	public void visit(CStm s);
	public void visit(AStm s);
	public void visit(PStm s);
	public double visit(Exp e);
	public double visit(IdExp e);
	public double visit(NumExp e);
	public double visit(OpExp e);
	public double visit(EseqExp e);
	public String visit(ExpList el);
	public String visit(PList el);
	public String visit(LList el);
}
