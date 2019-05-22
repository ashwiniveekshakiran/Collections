package com.arrayListPrograms;

import java.util.LinkedList;

public class ContainsDemo1 {

	public static void main(String[] args) {
		LinkedList<Object> list = new LinkedList<Object>();
		list.add("Light");
		list.add("Fan");
		list.add("Cooler");
		list.add("AC");
		list.add("Bulb");
		
		if(list.contains("Fan"))
		{
			System.out.println("Fan is available");
		}
		else
		{
			System.out.println("Fan is not available");
		}
	}

}
