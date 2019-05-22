package com.arrayListPrograms;

import java.util.ArrayList;
import java.util.List;

public class AddAllElements {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		list.add("ABC");
		list.add("BCD");
		list.add("EFG");
		list.add("HIJ");
		list.add("JKL");
		
		List<String> list1 = new ArrayList<String>();
		list1.add("MNP");
		list1.add("OPQ");
		list1.add("RST");
		
		System.out.println(list);
		System.out.println(list1);
		list.remove(2);
		System.out.println(list);
		
		list.addAll(list1);
		
	
		for(String s : list)
		{
			System.out.println(s);
		}
		
		list.addAll(2, list1);
		System.out.println(list);
		
	}

}
