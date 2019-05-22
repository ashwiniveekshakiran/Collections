package com.arrayListPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingDemo {

	public static void main(String[] args) {
		
		List<Object> list = new ArrayList<Object>();
		list.add("AA");
		list.add("BB");
		list.add("CC");
		list.add("DD");
		list.add("EE");
		
		System.out.println("Before Sorting:"+list);
		
		for (Object object : list) {
			System.out.println(object);
			
		}
		
		Collections.sort(list, Collections.reverseOrder());
		
		System.out.println("After Sorting:"+list);
		for (Object object : list) {
			System.out.println(object);
			
		}
		
		

	}

}
