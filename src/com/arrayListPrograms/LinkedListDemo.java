package com.arrayListPrograms;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

	public static void main(String[] args) {
		List<String> list = new LinkedList<String>();
		list.add("Ashwini");
		list.add("Aishwarya");
		list.add("Alekya");
		list.add("Akshitha");
		list.add("Divya");
		
//		for (String s : list) {
//			System.out.println(s);
//			
//		}
		
//		Iterator itr = list.iterator();
//		while(itr.hasNext())
//		{
//			Object val = itr.next();
//			System.out.println(val);
//		}
//		
		
	
		
		Iterator itr =list.listIterator(1);
		while(itr.hasNext())
		{
			Object val = itr.next();
			System.out.println(val);
		}
		

	}

}
