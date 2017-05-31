package robert;

public class Factorial {

	public static int doFactorial(int n) {
		int result = 1;
		while (n > 1) {
			result *= n;
			--n;
		}
		return result;

	}

}
