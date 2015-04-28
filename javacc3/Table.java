import java.util.Hashtable;

public class Table {
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