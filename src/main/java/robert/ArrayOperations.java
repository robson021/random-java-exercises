package robert;

import java.util.Arrays;

public class ArrayOperations {

	public static int findDuplicateNumberInArrayWithSorting(int[] arr) {
		Arrays.sort(arr);
		for (int i = 1; i < arr.length; i++) {
			if ( arr[i] == arr[i - 1] )
				return arr[i];
		}
		return -1;
	}

	public static int findDuplicateNumberInArray(int[] arr) {
		boolean[] truthArray = new boolean[arr.length + 1];
		for (int value : arr) {
			if ( truthArray[value] )
				return value;

			truthArray[value] = true;
		}
		return -1;
	}

}
