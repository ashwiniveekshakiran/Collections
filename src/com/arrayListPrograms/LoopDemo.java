package com.arrayListPrograms;

import java.util.ArrayList;

import java.util.List;

public class LoopDemo {

	// int a = 0;

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();
		for (int i = 2; i <= 40; i = i + 2) {
			System.out.println(i);
			list.add(i);
		}
		System.out.println(list);
	}

}

/**
 * 
 * for item = 2 , item raises by every 2nd number till 40 print value of every
 * item add item into list
 * 
 * 
 */
