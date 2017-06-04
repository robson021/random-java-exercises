package robert.concurrent;

import java.util.Random;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

@SuppressWarnings("Duplicates")
public class LocksExample {

	private int value = 0;

	private final Random random = new Random();

	private final Lock lock = new ReentrantLock();

	private final Condition condition = lock.newCondition();

	public void startExample() throws InterruptedException {
		Thread t1 = new Thread(this::increment);
		Thread t2 = new Thread(this::decrement);

		t1.start();
		t2.start();

		t1.join();
		t2.join();
	}

	private void increment() {
		for (int i = 0; i < 100; i++) {
			lock.lock();
			int sleepTime = random.nextInt(100);
			try {
				while (value > 2)
					condition.await();

				++value;
				System.out.println("value after increment: " + value);
			} catch (InterruptedException ignored) {
			} finally {
				condition.signal();
				lock.unlock();
			}

			try {
				Thread.sleep(sleepTime);
			} catch (InterruptedException ignored) {
			}
		}
	}

	private void decrement() {
		for (int i = 0; i < 100; i++) {
			lock.lock();
			int sleepTime = random.nextInt(100);
			try {
				while (value < 1)
					condition.await();

				--value;
				System.out.println("value after decrement: " + value);
			} catch (InterruptedException ignored) {
			} finally {
				condition.signal();
				lock.unlock();
			}

			try {
				Thread.sleep(sleepTime);
			} catch (InterruptedException ignored) {
			}
		}
	}

}
