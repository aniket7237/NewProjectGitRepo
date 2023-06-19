//package com.test;

public class Combinations {
	private static void generateCombinations(String s1, String s2) {
		if (s2.length() == 0) {
			System.out.println(s1);
		} else {
			for (int i = 0; i < s2.length(); i++) {
				String newPrefix = s1 + s2.charAt(i); // a
				String newRemaining = s2.substring(0, i) + s2.substring(i + 1); // bcd
				generateCombinations(newPrefix, newRemaining);

			}
		}
	}

	public static void main(String[] args) {

		String word = "abcd";
		generateCombinations("", word);
	}

}
