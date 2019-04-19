package robert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class ArrayOperations {

    public static <T> List<T> removeDuplicates(List<T> list) {
        // use LinkedHashSet to maintain original order of elements

        System.out.println("input: " + list);
        var set = new HashSet<>(list);

        var filtered = new ArrayList<>(set);
        System.out.println("without duplicates: " + filtered);

        return filtered;
    }

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
        int min = Arrays.stream(arr).min().getAsInt();
        int max = Arrays.stream(arr).max().getAsInt();
        System.out.println("Min/Max using stream:");
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
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

    public static Integer[] findMissingNumbersInArrayWithPossibleDuplicates(int[] array) {
        if (array.length < 1)
            throw new RuntimeException("Array is empty");

        boolean[] truthArray = new boolean[array.length];

        for (int element : array) {
            truthArray[element] = true;
        }

        var result = new ArrayList<Integer>();

        for (int i = 0; i < truthArray.length; i++) {
            if (!truthArray[i]) {
                result.add(i);
            }
        }

        return result.toArray(new Integer[0]);
    }

}
