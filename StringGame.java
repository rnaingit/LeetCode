package com.game;

import java.util.ArrayList;
import java.util.List;

public class StringGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] sizes = new int[] {1,3,3};

		String s = "vzyeivu";

		List<String> list = new ArrayList<String>();
		int i = 0;
		for (int size : sizes) {
			System.out.println(list);
			System.out.println(s);
			list.add(s.substring(0, size));
			s = s.replaceFirst(list.get(i), "");
			i++;
		}
		System.out.println(list);
		String answer = "";
		for (int j = 0; j < list.size(); j = j + 2) {

			if (j < list.size() - 1) {
				answer = answer + list.get(j + 1);
				answer = answer + list.get(j);
			}

		}
		if (list.size() % 2 != 0) {
			answer += list.get(list.size() - 1);
		}

		System.out.println(answer);
	}

}
