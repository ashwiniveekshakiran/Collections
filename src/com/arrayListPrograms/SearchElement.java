package com.arrayListPrograms;

import java.util.ArrayList;
import java.util.List;

public class SearchElement {

	public static void main(String[] args) {
		List<Object> list = new ArrayList<Object>();
		list.add("String");
		list.add("Red");
		list.add("Green");
		list.add("Yellow");
		list.add("White");
		list.add("Black");
		list.add("Brown");
		list.add("Cream");
		
		for(Object e:list)
		{
			System.out.println(e);
		}
		
		if(list.contains("Red"))
		{
			System.out.println("I found Red");
		}
		else
		{
			System.out.println("I didnt found Red");
		}
		

	}

}
