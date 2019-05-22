package com.setDemo;

import java.util.HashSet;
import java.util.Set;

public class ConvertToArray {

	public static void main(String[] args) {
		Set<Object> set = new HashSet<Object>();
		set.add("Lion");
		set.add("Tiger");
		set.add("Cheetha");
		
		System.out.println("Original Set " +set);
		
//		String[] new_array = new String(set.size());
//		set.toArray(new_array);
		String[] new_array = new String[set.size()];
	    set.toArray(new_array);
	    
	    for (String string : new_array) {
			System.out.println(string);
		}

	}

}
