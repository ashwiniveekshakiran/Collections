package com.arrayListPrograms;

import java.util.ArrayList;


public class CloneDemo {

	public static void main(String[] args) {
        ArrayList<String> list= new ArrayList<String>();
        list.add("Red");
        list.add("Green");
        list.add("Yellow");
        list.add("Orange");
        list.add("Maroon");
        
        System.out.println("Original ArrayList" +list);
        
        ArrayList<String> list1 = (ArrayList<String>)list.clone();
       
        System.out.println("Cloning: "+list1);
        
        

	}

}
