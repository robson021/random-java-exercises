package robert.codility;

import org.junit.Assert;
import org.junit.Test;

import java.util.stream.IntStream;

public class SkylinePaintTest {

    @Test
    public void countNeededStrokes() {
        int[] input = {1, 3, 2, 1, 2, 1, 5, 3, 3, 4, 2};

        int[] result = SkylinePaint.countNeededStrokes(input);
        int sum = IntStream.of(result).sum();

        Assert.assertEquals(5, result.length);
        Assert.assertEquals(9, sum);
    }

}