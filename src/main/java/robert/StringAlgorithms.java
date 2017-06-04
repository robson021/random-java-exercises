package robert;

public class StringAlgorithms {

	public static String reverseTextWithStringBuilder(String text) {
		return new StringBuilder(text).reverse()
				.toString();
	}

	public static String reverseTextWithCharArray(String text) {
		char[] chars = text.toCharArray();
		char[] reversed = new char[chars.length];

		for (int i = chars.length - 1, j = 0; i >= 0; i--) {
			reversed[j++] = chars[i];
		}
		return new String(reversed).intern();
	}

	public static boolean doesSentenceStartsWithLowercaseLetter(String text) {
		//int ascii = text.charAt(0);
		//return ascii >= 97;
		return Character.isLowerCase(text.codePointAt(0));
	}
}
