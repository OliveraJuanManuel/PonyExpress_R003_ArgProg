package PonyExpressTests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import PonyExpress.CorreoPE;

public class CorreoTests {
	CorreoPE ponyExpress;
	@Before
	public void setUp() {
		ponyExpress = new CorreoPE();
	}

	@Test
	public void test() {
		assertEquals(1, ponyExpress.caballos(new int[] { 18, 15 }));
		assertEquals(2, ponyExpress.caballos(new int[] { 43, 23, 40, 13 }));
		assertEquals(3, ponyExpress.caballos(new int[] { 33, 8, 16, 47, 30, 30, 46 }));
		assertEquals(3, ponyExpress.caballos(new int[] { 51, 51, 51 }));
		assertEquals(4, ponyExpress.caballos(new int[] { 6, 24, 6, 8, 28, 8, 23, 47, 17, 29, 37, 18, 40, 49 }));
	}

}
