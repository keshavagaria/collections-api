package com.csi.core;

public class Student implements Comparable<Student>{
private int rollno;
private int age;
private String name;
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
//@Override
//public int compareTo(Student s) {
//	return name.compareTo(s.name);
//}
@Override
public int compareTo(Student stud) {
	if(age==stud.age)
		return 0;
	
	else if(age>stud.age)
		return 1;
	
	else
		return -1;

}

}
