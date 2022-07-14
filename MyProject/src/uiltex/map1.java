package uiltex;

import java.util.*;

public class map1 {
	public static void main(String [] args) {
		Map mp=new HashMap();
		
		mp.put(1, "Krish");
		mp.put(2, "Chinmay");
//		mp.put(2, "Sahilaa");// If we put it with same key it would choose sahil instead of chinmay it selects the last one
		mp.put(3, "Sahilaa");
		
		System.out.println(mp);
		Set s=mp.entrySet();
		
		Iterator it=s.iterator();
		
		while(it.hasNext()) {
			Map.Entry me=(Map.Entry) it.next();
			System.out.println(me.getValue());
			System.out.println();
		}
		}
}
