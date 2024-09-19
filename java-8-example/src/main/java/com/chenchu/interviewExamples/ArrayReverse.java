package com.chenchu.interviewExamples;

import java.util.Arrays;

public class ArrayReverse {

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100,110 };

		System.out.println("Original array : " + Arrays.toString(arr));

		// Iterate through the first half of the array and reverse its elements.
		for (int i = 0; i < arr.length / 2; i++) {
			// Swap the elements at positions 'i' and 'length - i - 1'.
			int temp = arr[i];
			arr[i] = arr[arr.length - i - 1];
			arr[arr.length - i - 1] = temp;
		}

		// Print the reversed array using Arrays.toString() method.
		System.out.println("Reverse array : " + Arrays.toString(arr));
	}

}

// 110, 20, 30, 40, 50, 60, 70, 80, 90, 100,10 