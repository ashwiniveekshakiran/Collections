package com.mapDemo;

import java.util.HashMap;
import java.util.Map;

public class CloningMap {

	public static void main(String[] args) {
		HashMap<Object, Object> hmap = new HashMap<Object, Object>();
		hmap.put('a', "Red");
		hmap.put('b', "Green");
		hmap.put('c', "Voilet");
		hmap.put('d', "Yellow");
		hmap.put('e', "Orange");
		
		HashMap<Object, Object> new_hmap = (HashMap<Object, Object>) ((HashMap<Object, Object>) hmap).clone();
		
		System.out.println(new_hmap);
		
		if(hmap.containsKey('b'))
		{
			System.out.println("B");
		}
		else
		{
			System.out.println("Doesnot exist");
		}
 
	}

}
