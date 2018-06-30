package robert.concurrent;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProducerConsumerProblem {

    private static final int SIZE = 10;

    private final BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(SIZE);

    public void startExample() throws InterruptedException {
        Thread t1 = new Thread(new Producer());
        Thread t2 = new Thread(new Consumer());

        t1.start();
        t2.start();

        t1.join();
        t2.join();
        System.out.println("finish");
    }

    private class Producer implements Runnable {
        Random random = new Random();

        @Override
        public void run() {
            for (int i = 0; i < SIZE; i++) {
                try {
                    int value = random.nextInt(100);
                    queue.put(value);
                    System.out.println("added value: " + value + "; size now: " + queue.size());
                    Thread.sleep(10);
                } catch (InterruptedException ignored) {
                }
            }
        }
    }

    private class Consumer implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i < SIZE; i++) {
                try {
                    Integer taken = queue.take();
                    System.out.println("taken: " + taken + "; size now: " + queue.size());
                    Thread.sleep(20);
                } catch (InterruptedException ignored) {
                }
            }
        }
    }
}
