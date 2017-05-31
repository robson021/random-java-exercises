package robert.tests;

import org.junit.Assert;
import org.junit.Test;

import robert.ReverseString;

public class ReverseStringTest {

	@Test
	public void reverseStringTest() {

		final String text = "abcdef";
		String reversed1 = ReverseString.reverseWithCharArray(text);
		String reversed2 = ReverseString.reverseWithStringBuilder(text);

		System.out.println(reversed1);
		System.out.println(reversed2);

		Assert.assertEquals(reversed1, reversed2);
	}

}