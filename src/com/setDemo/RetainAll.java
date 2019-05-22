package com.setDemo;

import java.util.HashSet;

public class RetainAll {

	public static void main(String[] args) {
		HashSet<Object> hset = new HashSet<Object>();
		hset.add("Red");
		hset.add("Green");
		hset.add("Blue");
		hset.add("Voilet");
		hset.add("Pink");
		
		HashSet<Object> set = new HashSet<Object>();
		set.add("Red");
		set.add("Maroon");
		set.add("Blue");
		set.add("light Voilet");
		set.add("Baby Pink");
		
		HashSet<Object> set1 = new HashSet<Object>();
		set1.addAll(set);
		set1.addAll(hset);
		
		System.out.println(set1);
		
		set1.retainAll(set);
		set1.retainAll(hset);
		
		System.out.println("Retain " +set1);
		
		set1.removeAll(set);
		set1.removeAll(hset);
		
		System.out.println("Empty " +set1);
    	
		

	}

}
