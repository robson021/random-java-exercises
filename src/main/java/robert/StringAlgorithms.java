package robert;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Objects;

public class StringAlgorithms {

    public static char findFirstNonRepeatedCharacter1(String s) {
        var map = new LinkedHashMap<Character, Integer>();
        for (char c : s.toCharArray()) {
            map.merge(c, 1, (x, y) -> ++x);
        }

        char character = map.entrySet()
                .stream()
                .filter(e -> e.getValue() == 1)
                .findFirst()
                .orElseThrow()
                .getKey();

        System.out.println("First unique char in sentence '" + s + "' is: " + character);

        return character;
    }

    public static int countOccurrencesOfChar(String input, char c) {
        if (input == null || input.isEmpty()) {
            throw new RuntimeException("Empty string");
        }

        int counter = 0;

        char[] chars = input.toCharArray();
        for (int ascii : chars) {
            if (c == ascii) {
                ++counter;
            }
        }

        return counter;

    }

    public static String reverseTextWithStringBuilder(String text) {
        return new StringBuilder(text).reverse().toString();
    }

    public static String reverseTextWithCharArray(String text) {
        char[] chars = text.toCharArray();
        char[] reversed = new char[chars.length];

        for (int i = chars.length - 1, j = 0; i >= 0; i--, j++) {
            reversed[j] = chars[i];
        }
        return new String(reversed);
    }

    public static boolean doesSentenceStartsWithLowercaseLetter(String text) {
        //int ascii = text.charAt(0);
        //return ascii >= 97;
        return Character.isLowerCase(text.codePointAt(0));
    }

    public static boolean isStringRotationOfAnother(String base, String rotated) {
        if (areStringsNull(base, rotated)) {
            return false;
        }
        String concatenated = rotated.concat(rotated);
        return concatenated.contains(base);
    }

    public static boolean isStringRotationOfAnother2(String base, String rotated) {
        if (areStringsNull(base, rotated)) {
            return false;
        }

        int ascii = base.codePointAt(0);
        int index = rotated.indexOf(ascii);

        if (index == -1) {
            return false;
        }

        if (rotated.contains(base)) {
            return true;
        }

        String prefix = rotated.substring(index);
        String suffix = rotated.substring(0, index);

        String word = prefix + suffix;

        return base.equals(word);
    }

    private static boolean areStringsNull(String... strings) {
        return Arrays.stream(strings).anyMatch(Objects::isNull);
    }
}
