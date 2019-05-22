package com.setDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class EmptyHashSet {

	public static void main(String[] args) {
		 HashSet<Object> set = new HashSet<Object>();
		 set.add("KitKat");
		 set.add("Dairy milk");
		 set.add("Perk");
		 set.add("Munch");
		 set.add("5 star");
		 
		 System.out.println("Original set is :" +set);
		 
//		 set.removeAll(set);
//		 
//		 System.out.println("Empty set is" +set);
//		 
		 
//		 HashSet<Object> set1 = (HashSet<Object>)set.clone();
//		 
//		 System.out.println("After Cloning :"+set1);
		 
		 ArrayList<Object> list = new ArrayList<Object>(set);
		 System.out.println("The list of items are :" +list);
		 
		 
		 
		 

	}

}
