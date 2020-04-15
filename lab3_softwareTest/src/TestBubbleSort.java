import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;


public class TestBubbleSort {
	BubbleSort bub;
	
	@Before
	public void setUp(){
		bub = new BubbleSort();
	}
	
	//������������
	@Test
	public void testSort1(){
		assertArrayEquals(new int[]{1,2,5,6},bub.BubbleSort(new int[]{1,6,2,5}));
	}
	
	//���ظ����ֳ��ֵĲ�������
	@Test
	public void testSort2(){
		assertArrayEquals(new int[]{1,3,3,3,4,5},bub.BubbleSort(new int[]{3,4,1,3,3,5}));
	}
	
	//�������һ��forѭ���Ĳ�������
	@Test
	public void testSort3(){
		assertArrayEquals(new int[]{},bub.BubbleSort(new int[]{}));
	}

}

