package com.arrayListPrograms;

import java.util.LinkedList;
import java.util.List;

public class IndexDemo1 {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		list.add("Red");
		list.add("Green");
		list.add("Pink");
		list.add("Voilet");
		list.add("Blue");
		list.add("Maroon");
		
		
		list.remove(2);
		
	    list.removeFirst();
	    list.removeLast();
	    list.removeAll(list);
		
		System.out.println(list);
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println("Index of" +i+ "is" +list.get(i));
			
		}
		
		
		
		

	}

}
