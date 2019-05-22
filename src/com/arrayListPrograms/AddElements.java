package com.arrayListPrograms;

import java.util.ArrayList;
import java.util.List;

public class AddElements {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Ashwini");
		list.add("Selenum");
		list.add("Practice");
		list.add("Programs");
		 System.out.println(list);
		 
		for (String s : list) {
			System.out.println(s);
			
		}
		list.add(3, "AshwiniKiran");
		System.out.println(list);
		for(String s:list)
		{
			System.out.println(s);
		}
		
		

	}

}
