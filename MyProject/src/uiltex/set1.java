package uiltex;

import java.util.*;

public class set1 {
	public static void main(String[]args) {
		Set st=new HashSet(); //It allows us to store values in Hash order we cannot predict the order.
//		Set st=new LinkedHashSet();// It allows us to store values in our own writing order.
//		Set st=new TreeSet();//It does not allow null values and it sorts the list.
		
		st.add(20);
		st.add(50);
		st.add(10);
		st.add(60);
		st.add(30);
//		st.add(null);
		st.add(null);
		st.add(10);
		st.add(30);
		System.out.println(st);
	}

}
