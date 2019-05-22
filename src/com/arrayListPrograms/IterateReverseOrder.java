package com.arrayListPrograms;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IterateReverseOrder {

	public static void main(String[] args) {
		List<Object> list = new LinkedList<Object>();
		list.add("Pen");
		list.add("Pencil");
		list.add("Rubber");
		list.add("Sharpner");
		
		
		System.out.println(list);
		
		Iterator itr = ((LinkedList<Object>) list).descendingIterator();
		while(itr.hasNext())
		{
			Object value = itr.next();
			System.out.println(value);
		}
		
	}

}

