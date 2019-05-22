package com.arrayListPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseDemo {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(6);
		list.add(8);
		list.add(10);
		list.add(12);
		
		System.out.println("Original List" +list);
		
		Collections.reverse(list);
		
		System.out.println("Modified" +list);
		
	}

}
