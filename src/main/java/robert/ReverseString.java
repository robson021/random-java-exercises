package robert;

public class ReverseString {

	private static final String text = "abcde";

	public String reverseWithStringBuilder() {
		return new StringBuilder(text).reverse()
				.toString();
	}

	public String reverseWithCharArray() {
		char[] chars = text.toCharArray();
		char[] reversed = new char[chars.length];

		for (int i = chars.length - 1, j = 0; i >= 0; i--) {
			reversed[j++] = chars[i];
		}
		return new String(reversed);
	}
}
