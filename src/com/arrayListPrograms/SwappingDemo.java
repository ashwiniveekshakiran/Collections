package com.arrayListPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SwappingDemo {

	public static void main(String[] args) {
		List<Object> list = new ArrayList<Object>();
		list.add("English");
		list.add("Maths");
		list.add("Telugu");
		list.add("Hindi");
		list.add("Science");
		list.add("Social Studies");
		
		System.out.println("Before Swapping:" +list);
		Collections.swap(list, 1, 2);
		System.out.println("After Swapping:" +list);

	}

}
