package robert.tests;

import java.util.Random;

import org.junit.Assert;
import org.junit.Test;

import robert.ArrayOperations;

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

		System.out.println("time 1 (truth array): " + (end - start));
		Assert.assertEquals(k, duplicate);

		start = System.currentTimeMillis();
		duplicate = ArrayOperations.findDuplicateNumberInArrayWithSorting(arr);
		end = System.currentTimeMillis();

		System.out.println("time 2 (with sorting): " + (end - start));
		Assert.assertEquals(k, duplicate);
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

}
