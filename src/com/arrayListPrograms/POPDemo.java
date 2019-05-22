package com.arrayListPrograms;

import java.util.LinkedList;

public class POPDemo {

	public static void main(String[] args) {
		
		LinkedList<String> list = new LinkedList<String>();
		list.add("Afganishthan");
		list.add("Pakisthan");
		list.add("India");
		list.add("Australai");
		list.add("USA");
		
		System.out.println("Original list" +list);
		
		System.out.println("Removed element " +list.pop());
		
		System.out.println("After Pop :" +list);
		
		
 
	}

}
