package robert.tests.concurrent;

import org.junit.Test;
import robert.concurrent.LockWithCondition;

public class LockWithConditionTest {

    @Test
    public void test() throws Exception {
        LockWithCondition lockWithCondition = new LockWithCondition();
        lockWithCondition.startExample();
    }

}
