import static org.junit.Assert.*;

import org.junit.Test;

public class ObjectSetTest {

	@Test
	public void testIsMember() {
		Object[] a = {new Integer(1), new Integer(2), new Integer(3)};
		ObjectSet s = new ObjectSet (a);
		assertTrue("Wrong result in isMember", s.isMember(1));
		assertTrue("Wrong result in isMember", s.isMember(3));
		assertFalse("Wrong result in isMember", s.isMember(0));
	}
	
	@Test
	public void testCardinality() {
		Object[] a = {1, 2, 3};
		ObjectSet s = new ObjectSet (a);
		assertEquals("getCardinality return wrong value", 3, s.getCardinality());
	}
	
//	@Test
//	public void testSum() {
//		Object[] a = {-1, 10, 10000000};
//		ObjectSet s = new ObjectSet (a);
//		assertEquals("getCardinality return wrong value", 10000009, s.getSum());
//	}
//
//	@Test
//	public void testAllEven1() {
//		Object[] a = {2, 4, 6};
//		ObjectSet s = new ObjectSet (a);
//		assertTrue("allEven returns wrong value", s.allEven());
//	}
//	
//	@Test
//	public void testAllEven2() {
//		Object[] a = {2, 5, 6};
//		ObjectSet s = new ObjectSet (a);
//		assertFalse("allEven returns wrong value", s.allEven());
//	}
//
//	@Test
//	public void testMapSquares() {
//		Object[] a = {2, 5, 6};
//		ObjectSet s = new ObjectSet (a);
//		ObjectSet result = s.mapSquares();
//		assertTrue("Square not found", result.isMember(4));
//		assertTrue("Square not found", result.isMember(25));
//		assertTrue("Square not found", result.isMember(36));
//	}
}
