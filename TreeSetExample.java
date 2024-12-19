import java.util.TreeSet;
public class TreeSetExample {
	public static void main(String [] args) {
		TreeSet ts=new TreeSet();
		ts.add(10);
		ts.add(75);
		ts.add(50);
		ts.ceiling(100);
		ts.higher(65);
		ts.floor(9);
		ts.lower(5);
		System.out.println(ts);
	}
}
