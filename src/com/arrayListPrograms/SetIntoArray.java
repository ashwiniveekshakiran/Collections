package com.arrayListPrograms;

import java.util.HashSet;
import java.util.Set;

public class SetIntoArray {

	public static void main(String[] args) {
		
		Set<Object> h_set = new HashSet<Object>();
		h_set.add("Red");
        h_set.add("Green");
        h_set.add("Black");
        h_set.add("White");
        h_set.add("Pink");
        h_set.add("Yellow");
    System.out.println("Original Hash Set: " + h_set);
    // Creating an Array
    String[] new_array = new String[h_set.size()];
    h_set.toArray(new_array);
    
    System.out.println("Array elements :");
    
    for (String s : new_array) {
    	System.out.println(s);
		
	}

		
		

	}

}
