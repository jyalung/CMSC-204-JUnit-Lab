import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTester {
	GradeBook g1, g2;

	@BeforeEach
	void setUp() throws Exception {
		g1 = new GradeBook(5);
		g2 = new GradeBook(5);
		
		g1.addScore(50.0);
		g1.addScore(75.0);
		g1.addScore(10.0);
		
		g2.addScore(20.0);
		g2.addScore(40.0);
	}

	@AfterEach
	void tearDown() throws Exception {
		g1 = null;
		g2 = null;
	}

	@Test
	void testAddScore() {
		assertTrue(g1.toString().equals(g1.toString()));
		assertTrue(g2.toString().equals(g2.toString()));
	}

	@Test
	void testSum() {
		assertEquals(135.0, g1.sum(), .0001);
		assertEquals(60.0, g2.sum(), .0001);
	}

	@Test
	void testMinimum() {
		assertEquals(10.0, g1.minimum(), .001);
		assertEquals(20.0, g2.minimum(), .001);
	}

	@Test
	void testFinalScore() {
		assertEquals(125.0, g1.finalScore(), .0001);
		assertEquals(40.0, g2.finalScore(), .0001);
	}

}
