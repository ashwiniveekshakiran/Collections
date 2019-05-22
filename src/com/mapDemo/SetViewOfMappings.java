package com.mapDemo;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class SetViewOfMappings {

	public static void main(String[] args) {
		
		Map<Object, Object> hmap = new HashMap<Object, Object>();
		hmap.put(1, "Red");
		hmap.put(2, "Green");
		hmap.put(3, "Blue");
		
		Set<Entry<Object, Object>> set = hmap.entrySet();
		 System.out.println("Set Values " +set);
		System.out.println(hmap.get(2));
		
		Set keyvalue = hmap.keySet();
		
		System.out.println("The key values are " +keyvalue);
		
		System.out.println("Collection view values are " +hmap.values());

	}

}
