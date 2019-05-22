package com.arrayListPrograms;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class SwappingDemo1 {

	public static void main(String[] args) {
		List<String> list = new LinkedList<String>();
		list.add("ChotaBheem");
		list.add("Dainosour");
		list.add("Popey");
		list.add("Schoobi");
		list.add("Tom and Jerry");
		
		System.out.println("Original List :" +list);
		
		Collections.swap(list, 1, 2);
		
        System.out.println("After Swapping :" +list);
        
        Collections.shuffle(list);
        
        System.out.println("After shuffing :" +list);
	}

}
