package com.arrayListPrograms;

import java.util.ArrayList;
import java.util.List;

public class LengthOfList {

	public static void main(String[] args) {
		
		List<Object> list = new ArrayList<Object>();
		list.add("Ashwini");
		list.add("Selenium");
		list.add("QA");
		list.add("Appium");
		list.add(7);
		list.add('h');
		
		System.out.println("The length of the list is:" +list.size());
		
		list.remove(2);
		
		System.out.println("The length is :"+ list.size());
		

	}

}
