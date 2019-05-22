package com.setDemo;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetToTreeSet {

	public static void main(String[] args) {
		Set<String> hset = new HashSet<String>();
		hset.add("Lion");
		hset.add("Tiger");
		hset.add("Cheeta");
		hset.add("Cat");
		
		System.out.println("Set of items are " );
		
		for (String string : hset) {
			System.out.println(string);
			
		}
		
		Set<String> tset = new TreeSet<String>(hset);
		
		System.out.println("TreeSet items ");
		
		for (String string : tset) {
			System.out.println(string);
			
		}

	}

}
