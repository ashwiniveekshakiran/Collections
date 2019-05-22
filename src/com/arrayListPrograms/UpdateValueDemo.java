package com.arrayListPrograms;

import java.util.ArrayList;
import java.util.List;

public class UpdateValueDemo {

	public static void main(String[] args) {
		List<Object> list = new ArrayList<Object>();
		list.add("Ashaaa");
		list.add("Bhasha");
		list.add("Chotu");
		list.add('C');
		list.add('D');
		list.add(89);
		
		System.out.println(list);
		
		for (Object e : list) {
			System.out.println(e);
			
		}
		
		list.set(2, "Latha");
		
		System.out.println(list);
		for (Object e : list) {
			System.out.println(e);
			
		}

	}

}
