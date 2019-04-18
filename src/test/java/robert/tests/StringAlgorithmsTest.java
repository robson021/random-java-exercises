package robert.tests;

import org.junit.Assert;
import org.junit.Test;
import robert.StringAlgorithms;

public class StringAlgorithmsTest {

    @Test
    public void countOccurrencesOfChar() {
        Assert.assertEquals(4, StringAlgorithms.countOccurrencesOfChar("ala ma kota", 'a'));
        Assert.assertEquals(2, StringAlgorithms.countOccurrencesOfChar("kotek ma ale", 'e'));
        Assert.assertEquals(13, StringAlgorithms.countOccurrencesOfChar(
                "Write a program to count the number of occurrences of a character in String",
                ' ')
        );
    }

    @Test
    public void reverseStringTest() {
        final String text = "abcdef";
        String reversed1 = StringAlgorithms.reverseTextWithCharArray(text);
        String reversed2 = StringAlgorithms.reverseTextWithStringBuilder(text);

        System.out.println(reversed1);
        System.out.println(reversed2);

        Assert.assertEquals(reversed1, reversed2);
    }

    @Test
    public void checkSentence() {
        boolean one = StringAlgorithms.doesSentenceStartsWithLowercaseLetter("Abcde");
        boolean two = StringAlgorithms.doesSentenceStartsWithLowercaseLetter("qwerty");

        Assert.assertFalse(one);
        Assert.assertTrue(two);
    }

    @Test
    public void internCheck() {
        String a = "a" + "bc";
        String b = "ab" + "c";
        Assert.assertTrue(a == b);

        Assert.assertTrue(a.equals(b));

        b = new String("abc");
        Assert.assertFalse(a == b);
        Assert.assertTrue(a.equals(b));

        b = b.intern();
        Assert.assertTrue(a == b);
    }

    @Test
    public void isStringRotationOfAnother() {
        // I
        boolean one = StringAlgorithms.isStringRotationOfAnother("abcd", "dabc");
        boolean two = StringAlgorithms.isStringRotationOfAnother("abc", "cab");
        boolean three = StringAlgorithms.isStringRotationOfAnother("abc", "bac");

        Assert.assertTrue(one);
        Assert.assertTrue(two);
        Assert.assertFalse(three);

        // II
        one = StringAlgorithms.isStringRotationOfAnother2("abcd", "dabc");
        two = StringAlgorithms.isStringRotationOfAnother2("abc", "cab");
        three = StringAlgorithms.isStringRotationOfAnother2("abc", "bac");

        Assert.assertTrue(one);
        Assert.assertTrue(two);
        Assert.assertFalse(three);
    }

}