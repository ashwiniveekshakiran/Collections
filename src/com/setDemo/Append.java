package com.setDemo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Append {

	public static void main(String[] args) {
		 Set<Object> set = new HashSet<Object>();
		 set.add("KitKat");
		 set.add("Dairy milk");
		 set.add("Perk");
		 set.add("Munch");
		 set.add("5 star");
		 
		 System.out.println(set);
//		 
//		 for (Object e : set) {
//			 
//			 System.out.println(e);
//		 }
		 
		 Iterator itr = set.iterator();
		 while(itr.hasNext())
		 {
			 Object value = itr.next();
			 System.out.println(value);
		 }
		 
		 System.out.println("No of elements :" +set.size());
		 
			
		}
		 

	}
