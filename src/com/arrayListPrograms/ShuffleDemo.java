package com.arrayListPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShuffleDemo {

	public static void main(String[] args) {
		List<Object> list = new ArrayList<Object>();
		list.add("Red");
		list.add("Green");
		list.add("Yellow");
		list.add("White");
		list.add("Black");
		list.add("Brown");
		list.add("Orange");
		
		System.out.println("Before shuffle" +list);
		Collections.shuffle(list);
		System.out.println("After shuffle" +list);
		

	}

}
