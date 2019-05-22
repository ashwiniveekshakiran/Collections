package com.setDemo;

import java.util.TreeSet;

public class FirstAndLast {

	public static void main(String[] args) {
		TreeSet<String> tset = new TreeSet<String>();
		tset.add("Red");
		tset.add("Green");
		tset.add("Grey");
		tset.add("Blue");
		tset.add("Voilet");
		
		System.out.println(tset);
		
		Object first_element = tset.first();
		System.out.println("First element is :" +first_element);
		
		
		
		Object last_element = tset.last();
		System.out.println("First element is :" +last_element);
		
		Object noOfEle = tset.size();
		System.out.println("No of elements " +noOfEle);
		
		
		

	}

}
