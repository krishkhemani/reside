package uiltex;

import java.util.*;

public class stack1{
	public static void main(String [] args) {
		Stack s=new Stack();
		
		s.push(10);
		s.push(40);
		s.push(50);
		s.push(20);
		
		System.out.println(s);
		
		System.out.println(s.size());
		s.pop();
		System.out.println(s);
		System.out.println(s.peek());
		
		s.pop();
		System.out.println(s);
		
	}

}
