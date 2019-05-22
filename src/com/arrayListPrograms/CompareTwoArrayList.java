package com.arrayListPrograms;

import java.util.ArrayList;
import java.util.List;

public class CompareTwoArrayList {

	public static void main(String[] args) {
		List<Object> list = new ArrayList<Object>();
		list.add("AVK");
		list.add("AK");
		list.add("VK");
		list.add("CSK");
		
		List<Object> list1 = new ArrayList<Object>();
		list1.add("ASH");
		list1.add("WINI");
		list1.add("AK");
		list1.add("VK");
		list1.add("CSK");
		
		Boolean b =list.contains(list1);
		System.out.println(b);

	}

}
