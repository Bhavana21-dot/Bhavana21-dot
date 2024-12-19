import java.util.HashMap;

public class HashMapSample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap hm=new HashMap();
		hm.put(7, "Dhoni");
		hm.put(18,"Virat");
		hm.put(45,"Rohit");
		hm.put(93,"Burmah");
		hm.put(93,"Burmah");
		for(Object obj:hm.entrySet()) {
		System.out.println(obj);
	}
	}

}
