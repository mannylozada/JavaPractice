package com.manny.practice;

import java.io.*;

/*
 * Given two strings (lowercase a->z), how many characters do we need to remove
 * from either to make them anagrams?
 * EXAMPLE: hello, billion --> ANSWER: 6 (he from hello and biin from billion)
 * 
 */

public class Anagram {
	public static int NUMBER_LETTERS = 26;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String first = br.readLine();
		String second = br.readLine();
		System.out.println(numberNeeded(first, second));
	}

	private static int numberNeeded(String first, String second) {

		int[] firstStringNumChars = getChars(first);
		int[] secondStringNumChars = getChars(second);
		int ctr = 0;
		
		for (int i = 0; i < NUMBER_LETTERS; i++) {
			int difference = Math.abs(firstStringNumChars[i] - secondStringNumChars[i]);
			ctr += difference;
		}
		
		return ctr;
	}

	private static int[] getChars(String str) {
		int[] chars = new int[NUMBER_LETTERS];
		
		for (char c : str.toCharArray()) {
			chars[Character.getNumericValue(c) - 10]++;
		}

		return chars;
	}

}
