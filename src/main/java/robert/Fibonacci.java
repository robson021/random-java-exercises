package robert;

public class Fibonacci {

	public static int[] doFibSaveToArray(int n) {
		if ( n <= 2 )
			return new int[] { 1, 1 };

		int[] fib = new int[n];
		fib[0] = fib[1] = 1;

		for (int i = 2; i < n; i++) {
			fib[i] = fib[i - 1] + fib[i - 2];
		}
		return fib;
	}

	public static int doFib(int n) {
		if ( n == 0 )
			return 0;

		int a = 0;
		int b = 1;

		for (int i = 1; i < n; i++) {
			int tmp = b;
			b = b + a;
			a = tmp;
		}
		return b;

	}

	public static int doFibWithRecursion(int n) {
		if ( n == 0 )
			return 0;
		if ( n == 1 )
			return 1;

		return doFibWithRecursion(n - 1) + doFibWithRecursion(n - 2);
	}
}
