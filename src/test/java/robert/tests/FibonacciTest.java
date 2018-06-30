package robert.tests;

import org.junit.Assert;
import org.junit.Test;
import robert.Fibonacci;

import java.util.Arrays;

public class FibonacciTest {

    @Test
    public void fibbTest() {
        final int n = 10;
        int[] fib = Fibonacci.doFibSaveToArray(n);
        System.out.println(Arrays.toString(fib));

        final int expected = 55;
        int result = Fibonacci.doFibWithRecursion(n);
        Assert.assertEquals(expected, result);

        result = Fibonacci.doFib(n);
        Assert.assertEquals(expected, result);
    }

}