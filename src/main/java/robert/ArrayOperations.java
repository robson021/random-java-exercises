package robert;

import java.util.Arrays;

public class ArrayOperations {

    public static int findDuplicateNumberInArrayWithSorting(int[] arr) {
        Arrays.sort(arr);
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1])
                return arr[i];
        }
        return -1;
    }

    public static int findDuplicateNumberInSortedArray(int[] arr) {
        boolean[] truthArray = new boolean[arr.length + 1];
        for (int value : arr) {
            if (truthArray[value])
                return value;

            truthArray[value] = true;
        }
        return -1;
    }

    public static void removeDuplicates(int[] arr) {
        Arrays.sort(arr);
        for (int lastRemoved = -1, i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1] || arr[i] == lastRemoved) {
                lastRemoved = arr[i];
                arr[i] = 0;
            }
        }
    }

    public static int findMissingElementInSpan(int[] arr) {
        int expectedSum = 0;
        int actualSum = 0;
        for (int i = 0; i < arr.length; i++) {
            expectedSum += i;
            actualSum += arr[i];
        }
        return expectedSum - actualSum;
    }

    @SuppressWarnings("OptionalGetWithoutIsPresent")
    public static void printMinAndMaxUsingStreams(int[] arr) {
        int max = Arrays.stream(arr).max().getAsInt();
        int min = Arrays.stream(arr).min().getAsInt();
        System.out.println("Min/Max using stream:");
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }

    public static void printMinAndMaxUsingLoop(int[] arr) {
        int min = arr[0];
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) max = arr[i];
            if (arr[i] < min) min = arr[i];
        }
        System.out.println("Min/Max using loop:");
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }

    public static void findPairOfNumbersWhoseSumIsEqualToGivenNumber(int[] arr, int expectedSum) {
        System.out.println("Finding pairs for sum = " + expectedSum);
        final int arrLength = arr.length;
        for (int j, i = 0; i < arrLength; i++) {
            for (j = i + 1; j < arrLength; j++) {
                int a = arr[i];
                int b = arr[j];
                if (a + b == expectedSum)
                    System.out.println("Found pair: " + a + " and " + b);
            }
        }
    }

}
