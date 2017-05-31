package robert;

public class Fibonacci {

	public static int[] doFib(int n) {
		if ( n <= 2 )
			return new int[] { 1, 1 };

		int[] fib = new int[n];
		fib[0] = fib[1] = 1;

		for (int i = 2; i < n; i++) {
			fib[i] = fib[i - 1] + fib[i - 2];
		}
		return fib;
	}
}
