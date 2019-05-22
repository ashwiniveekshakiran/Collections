package com.treemapDemo;

import java.util.Collections;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class TreeMap {

	
	public static void main(String[] args) {
	
		Map<String, String> tmap = new java.util.TreeMap<String, String>();
		tmap.put("ash", "ashwini");
		tmap.put("kirr", "kiirran");
		tmap.put("viki", "veeksha");
		tmap.put("akhi", "akhil");
		
		System.out.println(tmap);
		
		Set<Entry<String, String>> set = tmap.entrySet();
		
		System.out.println("The set values are :" +set);
		
		Set keyvalues = tmap.keySet();
		System.out.println("The key values are " +keyvalues);
		
		System.out.println("The collection values are " +tmap.values());
		
		Map<String, String> new_tmap = new java.util.TreeMap<String, String>();
		new_tmap.putAll(tmap);
		System.out.println("Copied" +new_tmap);
		
		Map<String, String> tmap_new = (Map<String, String>) ((java.util.TreeMap<String, String>) tmap).clone();
		
		System.out.println("Cloned " +tmap_new);
		
//		tmap.clear();
//		System.out.println("Cleared " +tmap);
//		
		
		System.out.println("Greatest Key" +((java.util.TreeMap<String, String>) tmap).firstEntry());
		
		System.out.println("Lest Key" +((java.util.TreeMap<String, String>) tmap).lastEntry());
	
	
		System.out.println("ReverseOrder" +((java.util.TreeMap<String, String>) tmap).descendingKeySet());
		
		   
		 
	}

}
