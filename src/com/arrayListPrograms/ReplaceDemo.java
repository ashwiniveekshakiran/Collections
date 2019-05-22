package com.arrayListPrograms;

import java.util.ArrayList;
import java.util.List;

public class ReplaceDemo {

	public static void main(String[] args) {
	
		List<Integer> list = new ArrayList<Integer>();
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		System.out.println(list);
		
		list.set(1, 7);
		System.out.println(list);
		
	}

}
