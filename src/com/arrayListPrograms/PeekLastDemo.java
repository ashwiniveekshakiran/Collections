package com.arrayListPrograms;

import java.util.LinkedList;

public class PeekLastDemo {

	public static void main(String[] args) {
		
		LinkedList<Object> list = new LinkedList<Object>();
		list.add("Light");
		list.add("Fan");
		list.add("Cooler");
		list.add("AC");
		list.add("Bulb");
		
		System.out.println("List of items :" +list);
		
		System.out.println("Last item is :" +list.peekLast());
		
		System.out.println("First item is : " +list.peekFirst());
		
		System.out.println("List of items :" +list);
		

	}

}
