package Collections;

import java.util.Arrays;

public class intArray {
	static int largest(int[] arr) {
		int max = arr[0];

		// Traverse array elements from second and
		// compare every element with current max
		for (int i = 1; i < arr.length; i++)
			if (arr[i] > max)
				max = arr[i];

		return max;
	}

	public static void main(String[] args) {
		int arr[] = { 10, 324, 45, 90, 9808 };
		System.out.println(largest(arr));
		System.out.println(secondLargest(arr));
	}

	public static Integer secondLargest(int[] arr) {
		int n = arr.length;

		// Sort the array in non-decreasing order
		Arrays.sort(arr);
		
		for (int i = n - 2; i >= 0; i--) {

			// return the first element which is not equal to the 
			// largest element
			if (arr[i] != arr[n - 1]) {
				return arr[i];
			}
		}

		// If no second largest element was found, return -1
		return -1;
	}

}