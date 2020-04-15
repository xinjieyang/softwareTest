import static org.junit.Assert.assertArrayEquals;

import org.junit.Before;
import org.junit.Test;

public class TestBackPack {

	BackPack bac = new BackPack();
	
	@Before
	public void setUp() {
		bac = new BackPack();
	}
	
	@Test
	public void test1() {
		assertArrayEquals(new int[][]{{0,0,0,0,0,0,0,0,0,0,0},{0,0,0,4,4,4,4,4,4,4,4},{0,0,0,4,5,5,5,9,9,9,9},{0,0,0,4,5,6,6,9,10,11,11}},
				bac.BackPack_Solution(10,3,new int[]{3,4,5},new int[]{4,5,6}));
	}
	
	@Test
	public void test2() {
		assertArrayEquals(new int[][]{{0,0,0,0,0,0,0,0,0,0,0}},
				bac.BackPack_Solution(10,0,new int[]{},new int[]{}));
	}
	
}
