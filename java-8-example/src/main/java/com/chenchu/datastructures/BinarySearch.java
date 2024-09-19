package com.chenchu.datastructures;

public class BinarySearch {
	public static void main(String[] args) {
		int[] sortedArr = { 10, 20, 30, 40, 50, 60, 70, 80 };
		binarySearch(sortedArr, 90);
	}

	public static void binarySearch(int[] arr, int target) {
		int start = 0;
		int end = arr.length - 1;
		while (start <= end) {
			int mid = start + (end - start) / 2;
			// int mid=(start + end)/2;
			if (arr[mid] == target) {
				System.out.println("Found at index " + mid);
				return;
			} else if (arr[mid] > target) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		System.out.println("Not found");

	}
}
