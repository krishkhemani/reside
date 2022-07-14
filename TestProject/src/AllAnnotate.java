import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class AllAnnotate {

	@Test
	public void test1() {
		System.out.println("Test method1 called");
	}

	@Before
	public void testBefore() {
		System.out.println("Before called");
	}
	@After
	public void testAfter() {
		System.out.println("After called");
	}
	@BeforeClass
	public static void testBeforeClass() {
		System.out.println("Before Class called");
	}
	@AfterClass
	public static void testAfterClass() {
		System.out.println("After Class called");
	}
	@Ignore
	@Test
	public void testIgnore() {
		System.out.println("Test Ignored");
	}
	@Test
	public void test2() {
		System.out.println("Test method2 called");
	}
}
