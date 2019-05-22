package com.arrayListPrograms;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListToArrayList {

	public static void main(String[] args) {
		
		List<String> list = new LinkedList<String>();
		list.add("Apple");
		list.add("Banana");
		list.add("Gava");
	    list.add("mango");
	    list.add("Orange");
	    
	    System.out.println("Linked List items :" +list);
	    
	    List<String> list1 = new ArrayList<String>(list);
	    System.out.println("ArrayList items : " +list1);
		

	}

}
