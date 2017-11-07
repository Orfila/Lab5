package lab;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestCase1 {

	private static labone case1 = new labone();
	private static labone case2 = new labone();
	private static labone case3 = new labone();
	private static labone case4 = new labone();
	private static labone case5 = new labone();
	private static labone case6 = new labone();
	private static String text;    //ÎÄÕÂÄÚÈÝ
	
	@Before
	public void setUp() throws Exception {
		System.out.println("---begin test---");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("---end test---");
	}

	@Test
	public void testQueryBridgeWords1() {
		text = case1.InputFile("C://test", "Lab1.txt");
		String result = case1.queryBridgeWords("comfortable", "beautiful", text);
		assertEquals(" " , result);
	}

	@Test
	public void testQueryBridgeWords2() {
		text = case2.InputFile("C://test", "Lab1.txt");
		String result = case2.queryBridgeWords("ugly", "more", text);
		assertEquals(" " , result);
	}

	@Test
	public void testQueryBridgeWords3() {
		text = case3.InputFile("C://test", "Lab1.txt");
		String result = case3.queryBridgeWords("study", "economy", text);
		assertEquals(" " , result);
	}
	
	@Test
	public void testQueryBridgeWords4() {
		text = case4.InputFile("C://test", "Lab1.txt");
		String result = case4.queryBridgeWords("one", "of", text);
		assertEquals("" , result);
	}
	
	@Test
	public void testQueryBridgeWords5() {
		text = case5.InputFile("C://test", "Lab1.txt");
		String result = case5.queryBridgeWords("in", "big", text);
		assertEquals("the " , result);
	}

	@Test
	public void testQueryBridgeWords6() {
		text = case6.InputFile("C://test", "Lab1.txt");
		String result = case6.queryBridgeWords("the", "of", text);
		assertEquals("format study " , result);
	}
}
