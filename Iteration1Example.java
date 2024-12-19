import java.util.LinkedList;
import java.util.ListIterator;
public class Iteration1Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList l1=new LinkedList();
		l1.add(21);
		l1.add("Honey");
		l1.add(2,3);
		l1.add("PGR");
		ListIterator litr1=l1.listIterator();
		while(litr1.hasNext()) {
			System.out.println(litr1.next());
		}
	}

}
