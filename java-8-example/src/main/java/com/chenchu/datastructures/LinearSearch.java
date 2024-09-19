package com.chenchu.datastructures;

public class LinearSearch {
	public static void main(String[] args) {
		int[] arr = { 5, 12, 34, 56, 78, 90, 123 };
		int target = 56;

		int result = linearSearch(arr, target);

		if (result != -1) {
			System.out.println("Element " + target + " found at index " + result);
		} else {
			System.out.println("Element " + target + " not found in the array");
		}
	}

	public static int linearSearch(int[] arr, int target) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == target) {
				return i; // Return the index of the target element if found
			}
		}
		return -1; // Return -1 if the target element is not found in the array
	}

}
