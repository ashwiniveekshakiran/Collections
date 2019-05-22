package com.arrayListPrograms;

public class Student {

	String name;
	int id;
	char sex;
	public Student(String name, int id, char sex) {
		super();
		this.name = name;
		this.id = id;
		this.sex = sex;
		
	}
	@Override
	public String toString() {
		return " [name=" + name + ", id=" + id + ", sex=" + sex + "]";
	}
	
}
