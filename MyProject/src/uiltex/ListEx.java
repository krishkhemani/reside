package uiltex;

import java.util.*;

public class ListEx {
	
	public static void main(String[] args) {
//		List l=new ArrayList();
		LinkedList l=new LinkedList();
		
//		l.add(10);
//		l.add("Sandy");
		
		l.add(10);
		l.add(30);
		l.add(40);
		l.add(20);
		
		System.out.println(l);
		
		l.add(50);
		
		System.out.println(l);
		ListIterator it=l.listIterator();
		while(it.hasNext()) {
			System.out.println(it.next());
			System.out.println(it.hasPrevious());
			System.out.println(it.hasNext());
			System.out.println(it.previousIndex());
			System.out.println(it.nextIndex());
			
		}
		
//		Iterator it=l.iterator();
//		
//		while(it.hasNext())
//		{
//			System.out.println(it.next());
//		}
	}

}
