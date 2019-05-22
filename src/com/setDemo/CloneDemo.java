package com.setDemo;


import java.util.HashSet;


public class CloneDemo {

	public static void main(String[] args) {
		
		HashSet<Object> set = new HashSet<Object>();
		set.add("Red");
		set.add("Green");
		set.add("Blue");
		set.add("Voilet");
		set.add("Pink");
		
		HashSet<Object> set1 = (HashSet<Object>)set.clone();
		System.out.println(set1);

	}

}
