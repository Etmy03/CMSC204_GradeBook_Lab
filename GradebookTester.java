import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class GradebookTester {
	
	GradeBook g1;
	GradeBook g2;

	@Before
	public void setUp() throws Exception {
		g1 = new GradeBook(5);
		g1.addScore(10.0);
		g1.addScore(5.0);
		
		g2 = new GradeBook(5);
		g2.addScore(2.0);
		g2.addScore(4.0);
		g2.addScore(6.0);
	}

	@After
	public void tearDown() throws Exception {
		g1 = null;
		g2 = null;
	}

	@Test
	public void testAddScore() {
		assertTrue(g1.toString().equals("10.0 5.0 "));
		assertEquals(2, g1.getScoreSize(), .01);
	}
	@Test
	public void testSum() {
		assertEquals(15.0, g1.sum(), .01);
		assertEquals(12.0, g2.sum(), .10);
	}
	@Test
	public void testMinimum() {
		assertEquals(5.0, g1.minimum(), .01);
		assertEquals(2.0, g2.minimum(), .01);
	}
	@Test
	public void testFinalScore() {
		assertEquals(10.0, g1.finalScore(), .01);
		assertEquals(10.0, g2.finalScore(), .01);
	}

}
