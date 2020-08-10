package com.csi.core;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
public static void main(String[] args) {
	List<Student> list=new ArrayList<>();
	list.add(new Student(101,21,"Vishal"));
	list.add(new Student(102, 25, "Ravi"));
	list.add(new Student(108, 13, "Ram"));
	list.add(new Student(109, 16, "Keshav"));
	list.add(new Student(105, 18, "Bhisaal"));
	
	Collections.sort(list);
	
	for(Student s:list)
	{
		System.out.println(s.getRollno()+" "+s.getAge()+" "+s.getName());
	}
}
}
