import org.junit.*;
import org.junit.Assert.*; 
import junit.framework.TestCase;

/**
 * Test class for BinarySearch.java
 */
public class BinarySearchTest {

	BinarySearch s = new BinarySearch();

	@Test
	public void test1() {
		int[] array = {4,5,6};
		System.out.println("Test Case 1: \n");
		assertEquals(s.binary_search(array, 5), 1);
	}

	@Test
	public void test2() {
		
	}

	@Test
	public void test3() {
		
	}
}