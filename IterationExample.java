import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
public class IterationExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al1=new ArrayList();
		al1.add("Hello");
		al1.add(20);
		al1.add(true);
		al1.add(10.9);
		Iterator itr1=al1.iterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
	}

}
