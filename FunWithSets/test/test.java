import static org.junit.Assert.*;

import org.junit.Test;

public class test {

	@Test
	public void testIsMember() {
		int[] a = {1, 2, 3};
		IntegerSet s = new IntegerSet (a);
		assertTrue("Wrong result in isMember", s.isMember(1));
		assertTrue("Wrong result in isMember", s.isMember(3));
		assertFalse("Wrong result in isMember", s.isMember(0));
	}
	
	@Test
	public void testCardinality() {
		int[] a = {1, 2, 3};
		IntegerSet s = new IntegerSet (a);
		assertEquals("getCardinality return wrong value", 3, s.getCardinality());
	}
	
	@Test
	public void testSum() {
		int[] a = {-1, 10, 10000000};
		IntegerSet s = new IntegerSet (a);
		assertEquals("getCardinality return wrong value", 10000009, s.getSum());
	}

	@Test
	public void testAllEven1() {
		int[] a = {2, 4, 6};
		IntegerSet s = new IntegerSet (a);
		assertTrue("allEven returns wrong value", s.allEven());
	}
	
	@Test
	public void testAllEven2() {
		int[] a = {2, 5, 6};
		IntegerSet s = new IntegerSet (a);
		assertFalse("allEven returns wrong value", s.allEven());
	}

	@Test
	public void testMapSquares() {
		int[] a = {2, 5, 6};
		IntegerSet s = new IntegerSet (a);
		IntegerSet result = s.mapSquares();
		assertTrue("Square not found", result.isMember(4));
		assertTrue("Square not found", result.isMember(25));
		assertTrue("Square not found", result.isMember(36));
	}
}
