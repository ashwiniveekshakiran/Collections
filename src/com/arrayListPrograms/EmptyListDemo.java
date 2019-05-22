package com.arrayListPrograms;

import java.util.ArrayList;

import java.util.List;

public class EmptyListDemo {

	public static void main(String[] args) {
		List<Integer> li = new ArrayList<Integer>();
		li.add(2);
		li.add(4);
		li.add(6);
		li.add(8);
		
		System.out.println("Original List" +li);
		
		li.removeAll(li);
		
		System.out.println("Empty list is "+li);
		
		if(li.isEmpty())
		{
			System.out.println("Empty");
		}
		else
		{
			System.out.println("Not emoty");
		}
		

	}

}
