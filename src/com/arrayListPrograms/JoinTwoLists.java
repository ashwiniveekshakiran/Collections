package com.arrayListPrograms;
import java.util.LinkedList;
import java.util.List;

public class JoinTwoLists {

	public static void main(String[] args) {
		LinkedList<Object> list = new LinkedList<Object>();
		list.add("red");
		list.add("green");
		list.add("yellow");
		list.add("blue");
		
		LinkedList<Object> list1 = (LinkedList<Object>)list.clone();
		list1.add("Orange");
		list1.add("maroon");
		list1.add("voilet");
		list1.add("pink");
		
		System.out.println("After Cloning : " +list1);
		
		List<Object> a = new LinkedList<Object>();
		a.addAll(list);
		a.addAll(list1);
		
		System.out.println("list of items are :");
		
		for(Object e:a)
		{
			System.out.println(e);
		}
		
		
		

	}

}
