import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class bubblingTest {

	 
	@Before
	public void setUp() throws Exception {

	}

	@Test
	public void test1() {
		bubbling b = new bubbling();
		int[] arr = { 9, 8, 3, 7, 2 };
		b.bubb(arr);	
	}
	@Test
	public void test2() {
		bubbling b = new bubbling();
		int[] arr = { 99, 108, 3, 7, 2 };
		b.bubb(arr);	
	}
	@Test
	public void test3() {
		bubbling b = new bubbling();
		int[] arr = { 99, 108,13, 7, 2 };
		b.bubb(arr);	
	}
	
}
