package tests;

import static org.junit.Assert.*;
import org.junit.Test;

public class SquareUnit {

	@Test
	public void test() {
		UnitTesting org1 = new UnitTesting();
		assertEquals(16,org1.square(4) );
	}

}
