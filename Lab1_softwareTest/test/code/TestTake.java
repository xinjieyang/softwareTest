package code;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestTake {
	Take take;
	
	@Before
	public void setUp() {
		take = new Take();
	}
	
	@Test
	public void test1() {
		boolean result = take.canTakeOut(-3);
		assertEquals(false,result);
	}
	
	@Test
	public void test2() {
		boolean result = take.canTakeOut(0);
		assertEquals(true,result);
	}
	
	@Test
	public void test3() {
		boolean result = take.canTakeOut(51);
		assertEquals(true,result);
	}
	
	@Test
	public void test4() {
		boolean result = take.canTakeOut(64);
		assertEquals(false,result);
	}
	
	@Test
	public void test5() {
		boolean result = take.canTakeOut(79);
		assertEquals(false,result);
	}
	
	@Test
	public void test6() {
		boolean result = take.canTakeOut(93);
		assertEquals(true,result);
	}
	
	@Test
	public void test7() {
		boolean result = take.canTakeOut(100);
		assertEquals(false,result);
	}

}
