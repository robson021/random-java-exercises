package robert.concurrent;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class SemaphoreExample {

    private final Semaphore semaphore = new Semaphore(3);

    private int entranceCount = 0;

    public void execute() throws InterruptedException {
        ExecutorService pool = Executors.newFixedThreadPool(4);
        for (int i = 0; i < 16; i++) {
            pool.execute(this::enter);
        }
        Thread.sleep(500);
        System.out.println("shouting down pool");
        pool.shutdown();
        System.out.println("job done, entered jobs: " + entranceCount);
    }

    private void enter() {
        semaphore.acquireUninterruptibly();
        System.out.println("entered semaphore, available now: " + semaphore.availablePermits());
        try {
            Thread.sleep(15);
        } catch (InterruptedException ignored) {
        } finally {
            ++entranceCount;
            semaphore.release();
            System.out.println("Released semaphore, available now: " + semaphore.availablePermits());
        }
    }

}
