package com.company.strings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionSorting {
public static void main(String[] args) {
	
	List<String> list=new ArrayList<>();
	list.add("Ram");
	list.add("Aman");
	list.add("Balbeer");
	list.add("Shushil");
	list.add("Vishal");
	
	Collections.sort(list);
	
	list.forEach(s->System.out.print(s+" "));
	System.out.println("\nReverse Order: ");
	
	Collections.sort(list,Collections.reverseOrder());
	list.forEach(s->System.out.print(s+" "));
}
}
