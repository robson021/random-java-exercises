package robert.tests;

import java.util.Arrays;

import org.junit.Test;

import robert.Fibonacci;

public class FibonacciTest {

	@Test
	public void fibbTest() {
		int[] fib = Fibonacci.doFib(10);
		System.out.println(Arrays.toString(fib));
	}

}