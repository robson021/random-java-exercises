package robert.tests;

import org.junit.Assert;
import org.junit.Test;
import robert.StringAlgorithms;

public class StringAlgorithmsTest {

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
        boolean one = StringAlgorithms.isStringRotationOfAnother("abcd", "dabc");
        boolean two = StringAlgorithms.isStringRotationOfAnother("abc", "cab");
        boolean three = StringAlgorithms.isStringRotationOfAnother("abc", "bac");

        Assert.assertTrue(one);
        Assert.assertTrue(two);
        Assert.assertFalse(three);
    }

}