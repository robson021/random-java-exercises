package robert;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class NumbersTest {

    @Test
    public void isNumberPalindrome() {
        assertTrue(Numbers.isNumberPalindrome(1));
        assertTrue(Numbers.isNumberPalindrome(22));
        assertTrue(Numbers.isNumberPalindrome(101));
        assertTrue(Numbers.isNumberPalindrome(1221));
        assertTrue(Numbers.isNumberPalindrome(13331));
        assertTrue(Numbers.isNumberPalindrome(0));
        assertTrue(Numbers.isNumberPalindrome(11));

        assertFalse(Numbers.isNumberPalindrome(20));
        assertFalse(Numbers.isNumberPalindrome(102));
        assertFalse(Numbers.isNumberPalindrome(13321));
    }
}