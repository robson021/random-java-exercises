package robert.tests.concurrent;

import org.junit.Test;
import robert.concurrent.CountDownLatchExample;

public class CountDownLatchExampleTest {

    @Test
    public void test() throws Exception {
        CountDownLatchExample latchExample = new CountDownLatchExample();
        latchExample.countDownLatchExample();
    }

}
