package robert.tests.concurrent;

import org.junit.Test;

import robert.concurrent.LocksExample;

public class LocksExampleTest {

	@Test
	public void test() throws Exception {
		LocksExample locksExample = new LocksExample();
		locksExample.startExample();
	}

}
