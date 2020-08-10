package com.csi.java8ComparatorNulls;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Triangle> list=new ArrayList<>();
		list.add(new Triangle(101, "Equilateral"));
		list.add(new Triangle(99, "Right Angled"));
		list.add(new Triangle(111, "Isosceles"));
		list.add(new Triangle(105, null));
		list.add(new Triangle(null, "Scalene"));
	
		System.out.println("Sorting by type and null first");
		Comparator<Triangle> cm1=Comparator.comparing(Triangle::getType,Comparator.nullsFirst(String::compareTo));
		Collections.sort(list,cm1);
		list.forEach(s->System.out.println(s));
		
		System.out.println("\nSorting by type and null last");
		Comparator<Triangle> cm2=Comparator.comparing(Triangle::getType,Comparator.nullsLast(String::compareTo));
		Collections.sort(list,cm2);
		list.forEach(s->System.out.println(s));
		
		System.out.println("\nSorting by id and null first");
		Comparator<Triangle> cm3=Comparator.comparing(Triangle::getId,Comparator.nullsFirst(Integer::compare));
		Collections.sort(list,cm3);
		list.forEach(s->System.out.println(s));
		
		System.out.println("\nSorting by id and null last");
		Comparator<Triangle> cm4=Comparator.comparing(Triangle::getId,Comparator.nullsLast(Integer::compare));
		Collections.sort(list,cm4);
		list.forEach(s->System.out.println(s));
	}
}
