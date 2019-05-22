package com.arrayListPrograms;

import java.util.ArrayList;
import java.util.List;

public class IndexDemo {

	public static void main(String[] args) {
	List<Integer> list = new ArrayList<Integer>();
	list.add(2);
	list.add(3);
	list.add(12);
	list.add(65);
	
	System.out.println("Original List is" +list);
	
	for (int i = 0; i < list.size(); i++) {
	
		System.out.println(list.get(i));
	}
	
	}

}
