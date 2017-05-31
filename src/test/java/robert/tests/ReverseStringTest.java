package robert.tests;

import org.junit.Assert;
import org.junit.Test;

import robert.ReverseString;

public class ReverseStringTest {

	@Test
	public void reverseStringTest() {
		ReverseString reverseString = new ReverseString();
		String reversed1 = reverseString.reverseWithCharArray();
		String reversed2 = reverseString.reverseWithStringBuilder();

		System.out.println(reversed1);
		System.out.println(reversed2);

		Assert.assertEquals(reversed1, reversed2);
	}

}