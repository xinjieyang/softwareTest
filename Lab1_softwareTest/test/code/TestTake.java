package code;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;


@RunWith(Parameterized.class)
public class TestTake {
	Take take;
	private int money;
	private boolean result;
	public TestTake(int m,boolean r) {
		money = m;
		result = r;
	}
	
	@Before
	public void setUp() {
		take = new Take();
	}
	
	@Test
	public void test() {
		assertEquals(result,take.canTakeOut(money));
	}
	
	@Parameters
	public static Collection data() {
		return Arrays.asList(new Object[][]{
			{-2,false},
			{0,true},
			{1,true},
			{3,true},
			{4,false},
			{5,true},
			{6,true},
			{9,false},
			{10,true},
			{14,false},
			{17,true},
			{19,false},
			{21,true},
			{25,true},
			{37,true},
			{41,true},
			{44,false},
			{46,false},
			{52,true},
			{61,true},
			{71,true},
			{79,false},
			{83,true},
			{84,false},
			{85,true},
			{93,true},
			{94,false},
			{95,false}
		});
	}
}
