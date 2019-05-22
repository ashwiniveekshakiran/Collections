package com.arrayListPrograms;

import java.util.LinkedList;
import java.util.List;

public class Insert {

	public static void main(String[] args) {
		List<Object> list = new LinkedList<Object>();
		list.add("Pot");
		list.add("Top");
		list.add("Pad");
		list.add("Rat");
		
		System.out.println(list);
		
		list.add(1, "Lap");
		
        System.out.println(list);
        
        list.add(0, "Lot");
        list.add(4, "Flop");
        
        System.out.println(list);
	}

}
