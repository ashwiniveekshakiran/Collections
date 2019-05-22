package com.arrayListPrograms;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {

	public static void main(String[] args) {
		List<Object> list = new ArrayList<Object>();
		list.add(2);
		list.add('T');
		list.add("Ashwini");
		list.add("Selenium");
		list.add("QA");
		list.add("ManualTesting");
		Iterator<Object> itr = list.iterator();
		while(itr.hasNext())
		{
			Object value=itr.next();
			System.out.println(value);
			
		}
		

	}

}
