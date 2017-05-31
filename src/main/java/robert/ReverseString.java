package robert;

public class ReverseString {

	public static String reverseWithStringBuilder(String text) {
		return new StringBuilder(text).reverse()
				.toString();
	}

	public static String reverseWithCharArray(String text) {
		char[] chars = text.toCharArray();
		char[] reversed = new char[chars.length];

		for (int i = chars.length - 1, j = 0; i >= 0; i--) {
			reversed[j++] = chars[i];
		}
		return new String(reversed);
	}
}
