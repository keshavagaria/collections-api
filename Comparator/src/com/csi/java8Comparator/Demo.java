package com.csi.java8Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Demo {
	
	public static void main(String[] args) {
		
		List<Employee> list=new ArrayList<>();
		list.add(new Employee(101,"Vishal"));
		list.add(new Employee(100, "Rahul"));
		list.add(new Employee(111, "Babloo"));
		list.add(new Employee(99, "Aman"));
		
		Comparator<Employee> c1=Comparator.comparing(Employee::getId);
		Collections.sort(list,c1);
		
		System.out.println("Sorting by id");
		list.forEach(s->System.out.println(s));
		
		System.out.println("Sorting by name");
		Comparator<Employee> c2=Comparator.comparing(Employee::getName);
		Collections.sort(list,c2);
		list.forEach(s->System.out.println(s));
		
		
	}

}
