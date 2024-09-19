package com.chenchu.interviewExamples;

import java.util.Arrays;

public class AnagramString {
	public static void main(String[] args) {
		String str1 = "now";
		String str2 = "own";
		if (str1.length() != str2.length()) {
			System.out.println("two strings are not anagram");
			return;
		}

		for (int i = 0; i < str1.length(); i++) {
			char c = str1.charAt(i);
			int index = str2.indexOf(c);

			if (index != -1) {
				str2 = str2.substring(0, index) + str2.substring(index + 1, str2.length());
			} else {
				System.out.println("two strings are not anagram");
				return;
			}
		}
		if (str2.isEmpty()) {
			System.out.println("two strings are anagram");
		} else {
			System.out.println("two strings are not anagram");
		}
	}

	public void checkAnagram() {
		String str1 = "Race";
		String str2 = "Care";
		// check if length is same
		if (str1.length() == str2.length()) {

			// convert strings to char array
			char[] charArray1 = str1.toCharArray();
			char[] charArray2 = str2.toCharArray();

			// sort the char array
			Arrays.sort(charArray1);
			Arrays.sort(charArray2);

			// if sorted char arrays are same
			// then the string is anagram
			boolean result = Arrays.equals(charArray1, charArray2);

			if (result) {
				System.out.println(str1 + " and " + str2 + " are anagram.");
			} else {
				System.out.println(str1 + " and " + str2 + " are not anagram.");
			}
		} else {
			System.out.println(str1 + " and " + str2 + " are not anagram.");
		}

	}
}
