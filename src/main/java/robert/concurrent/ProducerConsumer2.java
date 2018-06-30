package robert.concurrent;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Random;

@SuppressWarnings("Duplicates")
public class ProducerConsumer2 {

    private static final int SIZE_LIMIT = 10;

    private static final int ALL_ELEMENTS_SIZE = 100;

    private Deque<Integer> list = new LinkedList<>();

    private final Object locker = new Object();

    public void startExample() throws InterruptedException {
        Thread t1 = new Thread(this::produce);
        Thread t2 = new Thread(this::consume);

        t1.start();
        t2.start();

        t1.join();
        t2.join();
    }

    private void produce() {
        Random random = new Random();
        for (int i = 0; i < ALL_ELEMENTS_SIZE; i++) {
            synchronized (locker) {
                while (list.size() >= SIZE_LIMIT)
                    waitForCall();

                int value = random.nextInt(10);
                list.add(value);
                System.out.println("added value: " + value);
                locker.notify();
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException ignored) {
            }
        }
    }

    private void consume() {
        for (int i = 0; i < ALL_ELEMENTS_SIZE; i++) {
            synchronized (locker) {
                while (list.isEmpty())
                    waitForCall();

                System.out.println("Taken: " + list.removeFirst());
            }
            try {
                Thread.sleep(50);
            } catch (InterruptedException ignored) {
            }
        }
    }

    private void waitForCall() {
        try {
            locker.wait();
        } catch (InterruptedException ignored) {
        }
    }
}
