import java.util.LinkedList;
import java.util.ListIterator;
public class Itertion2Example {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList l1=new LinkedList();
		l1.add(21);
		l1.add("Honey");
		l1.add(2,3);
		l1.add("PGR");
		ListIterator litr1=l1.listIterator(l1.size());
		while(litr1.hasPrevious()) {
			System.out.println(litr1.previous());
		}
	}

}
