package com.arrayListPrograms;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		List<Object> list = new ArrayList<Object>();
		list.add(new Student("Ashwini", 1276, 'F'));
		list.add(new Student("Veeksha", 127, 'F'));
		list.add(new Student("Kiran", 12, 'M'));
		
		for (Object object : list) {
			System.out.println(object);
			
		}
		

	}

}
