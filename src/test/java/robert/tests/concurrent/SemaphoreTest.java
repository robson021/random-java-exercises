package robert.tests.concurrent;

import org.junit.Test;

import robert.concurrent.SemaphoreExample;

public class SemaphoreTest {

	@Test
	public void test() throws Exception {
		SemaphoreExample semaphoreExample = new SemaphoreExample();
		semaphoreExample.execute();
	}
}
