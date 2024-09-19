package com.chenchu.datastructures;

import java.util.Arrays;

public class MergeSort {
	public static void main(String[] args) {
		//Pre-req: 1. Both Arrays should be sorted.
		         // 2.Merge sort between two arrays
		int[] a = { 3, 7, 9, 10, 15 };
		int[] b = { 1, 5, 8, 11, 17, 20, 22 };
		twoWayMerge(a, b);
	}

	public  static void twoWayMerge(int[] a, int[] b) {
		int m = a.length;
		int n = b.length;
		int[] c = new int[m + n];
		int i = 0, j = 0, k = 0;
		while (i < m && j < n) {
			if (a[i] < b[j]) {
				c[k] = a[i];
				i++;
			} else {
				c[k] = b[j];
				j++;
			}
			k++;
		}
		while(j<n) {
			c[k]=b[j];
			k++;
			j++;
		}
		
		while(i<m) {
			c[k]=b[i];
			k++;
			i++;
		}
		System.out.println( Arrays.toString(c));
	}
}