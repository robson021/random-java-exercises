package robert.tests;

import org.junit.Assert;
import org.junit.Test;

import robert.Factorial;

public class FactorialTest {

	@Test
	public void factorialTest() {
		final int n = 5;
		final int result = 120;

		int r = Factorial.doFactorial(n);
		Assert.assertEquals(r, result);

		r = Factorial.doRecursiveFactorial(n);
		Assert.assertEquals(r, result);
	}

}
