package robert.tests.concurrent;

import org.junit.Test;
import robert.concurrent.ProducerConsumer2;
import robert.concurrent.ProducerConsumerProblem;

public class ProducerConsumerProblemTest {

    @Test
    public void test() throws Exception {
        new ProducerConsumerProblem().startExample();
    }

    @Test
    public void test2() throws Exception {
        ProducerConsumer2 producerConsumer = new ProducerConsumer2();
        producerConsumer.startExample();
    }

}
