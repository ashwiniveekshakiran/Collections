package com.arrayListPrograms;

import java.util.ArrayList;
import java.util.List;

public class LastIndexOfDemo {

	public static void main(String[] args) {
		
		List<Object> list = new ArrayList<Object>();
		list.add(1);
	      list.add(88);
	      list.add(9);
	      list.add(17);
	      list.add(17);
	      list.add(9);
	      list.add(17);
	      list.add(91);
	      list.add(27);
	  
		
	      System.out.println("Last occurrence of element 1: "+list.lastIndexOf(1));
	      System.out.println("Last occurrence of element 9: "+list.lastIndexOf(9));
	      System.out.println("Last occurrence of element 17: "+list.lastIndexOf(17));
	      System.out.println("Last occurrence of element 91: "+list.lastIndexOf(91));
	      System.out.println(list.get(4));
	     System.out.println(list.indexOf(88));
		

	}

}
