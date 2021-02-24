package mx.tec.lab;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class OtherClassTest {

	OtherClass other = new OtherClass();

	@Test
	public void testMultiply() {
		int expected = 6;
		int actual = other.multiply(2,3);
		assertEquals(expected, actual);
	}

	@Test
	public void testMultiply_ExceptionIsThrown() {
	    try {
	    	int expected = 6000;
			int actual = other.multiply(2000,3);
	        //fail("Exception not thrown");
	    } catch (IllegalArgumentException e) {
	        assertEquals("X should be less than 1000", e.getMessage());
	    }
	}


}
