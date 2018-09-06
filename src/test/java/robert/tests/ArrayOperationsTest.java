package robert.tests;

import org.junit.Assert;
import org.junit.Test;
import robert.ArrayOperations;

import java.util.Arrays;
import java.util.Random;

public class ArrayOperationsTest {

    @Test
    public void findDuplicate() {
        int[] arr = new int[1_000_000];

        // values:   [1, n]; n > 0
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }

        final int k = 5;
        final int index = arr.length >> 1;
        arr[index] = k;
        System.out.println("index: " + index + " = " + k);

        shuffle(arr);

        long start = System.currentTimeMillis();
        int duplicate = ArrayOperations.findDuplicateNumberInArray(arr);
        long end = System.currentTimeMillis();

        System.out.println("time 1 (truth array): " + (end - start) + " ms");
        Assert.assertEquals(k, duplicate);

        start = System.currentTimeMillis();
        duplicate = ArrayOperations.findDuplicateNumberInArrayWithSorting(arr);
        end = System.currentTimeMillis();

        System.out.println("time 2 (with sorting): " + (end - start) + " ms");
        Assert.assertEquals(k, duplicate);
    }

    @Test
    public void removeDuplicates() {
        System.out.println("Remove duplicates test");
        int[][] testData = new int[][]{
                {1, 1, 2, 2, 3, 4, 5},
                {1, 1, 1, 1, 1, 1, 1},
                {1, 2, 3, 4, 5, 6, 7},
                {1, 2, 1, 1, 1, 1, 1},
        };
        for (int[] arr : testData) {
            System.out.println("###############################");
            System.out.println("Before:" + Arrays.toString(arr));
            ArrayOperations.removeDuplicates(arr);
            System.out.println("After:" + Arrays.toString(arr));
        }
    }

    @Test
    public void printMaxAndMin() {
        int[] arr = getArray();
        ArrayOperations.printMinAndMaxUsingStreams(arr);
        ArrayOperations.printMinAndMaxUsingLoop(arr);
    }

    @Test
    public void findPairOfNumbersInArrayWhoseSumIsEqualToGivenNumber() {
        int[] arr = getArray();
        ArrayOperations.findPairOfNumbersWhoseSumIsEqualToGivenNumber(arr, 11);
    }

    private void shuffle(int[] arr) {
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            int j = random.nextInt(arr.length);
            swap(arr, i, j);
        }
    }

    private void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    private int[] getArray() {
        return new int[]{1, 2, 3, 4, 5, 0, -100, 99, 4, 6, 2, 1, 99, 8};
    }

}
