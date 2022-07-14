import static org.junit.Assert.*;

import org.junit.Test;

public class TestProg {

	@Test
	public void test() {
		
		String s1="helloo";
		String s2="admin";
		
		String str1=new String("hello");
		String str2=new String("hello");
		
//		assertEquals(str1,str2);
		
		assertTrue(s1.length()>s2.length());
	}

}
