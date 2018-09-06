package robert.concurrent;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchExample {

    private final CountDownLatch latch = new CountDownLatch(5);

    public void countDownLatchExample() throws InterruptedException {
        long count = latch.getCount();
        for (long i = 0; i < count; i++)
            new Thread(new Task()).start();

        System.out.println("awaiting for tasks...");
        latch.await();
        System.out.println("task finished");
    }

    private class Task implements Runnable {
        @Override
        public void run() {
            System.out.println("task start");
            try {
                Thread.sleep(100);
            } catch (InterruptedException ignored) {
            }
            System.out.println("task end");
            latch.countDown();
        }
    }

}
