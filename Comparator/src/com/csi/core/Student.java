package com.csi.core;

import java.util.Comparator;

public class Student {
int rollno;
int age;
String name;
public int getRollno() {
	return rollno;
}
public void setRollno(int rollno) {
	this.rollno = rollno;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Student(int rollno, int age, String name) {
	super();
	this.rollno = rollno;
	this.age = age;
	this.name = name;
}
}
class AgeComparator implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		if(o1.age==o2.age)
		return 0;
		
		else if(o1.age>o2.age)
			return -1;
		
		else
			return 1;
	}
	
}

class NameComparator implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		
		return o2.name.compareTo(o1.name);
	}
}
