package robert.tests;

import org.junit.Assert;
import org.junit.Test;

import robert.Factorial;

public class FactorialTest {

	@Test
	public void factorialTest() {
		int result = Factorial.doFactorial(5);
		Assert.assertEquals(120, result);
	}

}
