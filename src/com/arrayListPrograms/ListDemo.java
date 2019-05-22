package com.arrayListPrograms;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		List<Object> list = new ArrayList<Object>();
		list.add("Ashwini");
		list.add("Kiran");
		list.add("Veeksha");
		list.add(3);
		list.add('H');
		list.add("AVK");
		
		System.out.println(list.size());
		System.out.println(list.get(3));
		System.out.println(list);
		
		for(Object e:list)
		{
			System.out.println(e);
		}
		

	}

}
