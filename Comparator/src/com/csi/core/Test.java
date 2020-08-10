package com.csi.core;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
public static void main(String[] args) {
	List<Student> list=new ArrayList<>();
	list.add(new Student(96,21,"Ramu"));
	list.add(new Student(95,20,"Keshav"));
    list.add(new Student(97,22,"Chaman"));
	list.add(new Student(98,18,"Ramesh"));
	list.add(new Student(94,12,"Suresh"));

	Collections.sort(list,new NameComparator());
	System.out.println("Sorting by name");
	for(Student s:list)
	{
		System.out.println(s.getRollno()+" "+s.getAge()+" "+s.getName());
	}
	System.out.println("\n");
	Collections.sort(list,new AgeComparator());
	System.out.println("Sorting by age");
	for(Student s:list)
	{
		System.out.println(s.getRollno()+" "+s.getAge()+" "+s.getName());
	}
}
}
