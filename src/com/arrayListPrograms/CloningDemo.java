package com.arrayListPrograms;

import java.util.ArrayList;

public class CloningDemo {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Geniliya");
		al.add("Trisha");
		al.add("Soundarya");
		al.add("Samantha");
		al.add("Thamanna");
		
		System.out.println("Original list : " +al);
		
		ArrayList<String> al1 = (ArrayList<String>)al.clone();
		System.out.println("After Cloning :" +al1);

	}

}
