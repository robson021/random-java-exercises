package robert.concurrent;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchExample {

	private CountDownLatch latch = new CountDownLatch(5);

	public void countDownLatchExample() throws InterruptedException {
		for (int i = 0; i < latch.getCount(); i++) {
			new Thread(new Task()).start();
		}
		System.out.println("awaiting for tasks...");
		latch.await();
		System.out.println("task finished");
	}

	private class Task implements Runnable {

		@Override
		public void run() {
			System.out.println("task start");
			try {
				Thread.sleep(150);
			} catch (InterruptedException ignored) {
			}
			System.out.println("task end");
			latch.countDown();
		}
	}

}
