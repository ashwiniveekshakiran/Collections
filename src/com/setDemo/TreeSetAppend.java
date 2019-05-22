package com.setDemo;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetAppend {

	public static void main(String[] args) {
		TreeSet<String> tset = new TreeSet<String>();
		tset.add("Red");
		tset.add("Green");
		tset.add("Grey");
		tset.add("Blue");
		tset.add("Voilet");
		
		System.out.println(tset);
		
		Iterator itr = tset.iterator();
		while(itr.hasNext())
		{
			Object value = itr.next();
			System.out.println(value);
		}
		
		TreeSet<String> tset1 =  (TreeSet<String>)tset.clone();
		
		
		System.out.println("All colors "  +tset1);
		
		Iterator itr1 = tset1.descendingIterator();
		while(itr1.hasNext())
		{
			Object value = itr1.next();
			System.out.println("" +value);
		}
		

		
		

	}

}
