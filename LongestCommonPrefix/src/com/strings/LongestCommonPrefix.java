package com.strings;

public class LongestCommonPrefix {
	public static String compareStrings(String str1, String str2) {
		String answer = "";
		String tempStr = "";
		for (int i = 0; i < str1.length(); i++) {
			tempStr = tempStr + str1.charAt(i);
			if (str2.startsWith(tempStr))
				answer = answer + str1.charAt(i);
			else
				break;
		}
		return answer;
	}

	public static String longestCommonPrefix(String[] strs) {
		String finalString = "";
		String minString = "";
		int minLength = Integer.MAX_VALUE;
		for (String i : strs) {
			int length = i.length();
			if (length < minLength) {
				minLength = length;
				finalString = i;
			}

		}

		for (String i : strs) {

			finalString = compareStrings(finalString, i);
		}

		return finalString;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strs = new String[] { "roh", "rohit", "ro" };
		String result = longestCommonPrefix(strs);
		System.out.println(result);

	}

}
