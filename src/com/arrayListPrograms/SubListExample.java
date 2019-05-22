package com.arrayListPrograms;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SubListExample {

	public static void main(String[] args) {
	List<Object> list = new ArrayList<Object>();
	list.add("English");
	list.add("Telugu");
	list.add("Hindi");
	list.add("Maths");
	list.add("Science");
	list.add("Social");
	
	Iterator<Object> itr =list.iterator();
	while(itr.hasNext())
	{
		Object value = itr.next();
		System.out.println(value);
	}
	
	List<Object> list1 = new ArrayList<Object>(list.subList(3, 5));
	System.out.println("SubList:"+list1);

	}

}
