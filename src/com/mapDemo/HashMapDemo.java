
package com.mapDemo;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
	
	Map<Integer, String> hmap = new HashMap<Integer, String>();
	hmap.put(1, "Ashwini");
	hmap.put(2, "Veeksha");
	hmap.put(3, "Kiran");
	
	System.out.println(hmap.get(1));
	for (String string : hmap) {
		System.out.println(string);
	}
	
	
	

	}

}
