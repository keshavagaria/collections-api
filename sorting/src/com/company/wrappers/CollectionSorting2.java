package com.company.wrappers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionSorting2 {
public static void main(String[] args) {
	
	List list=new ArrayList();
	list.add(Integer.valueOf(500));
	list.add(Integer.valueOf(400));
	list.add(Integer.valueOf(300));
	list.add(850); //internally will be converted into objects as Integer.valueOf(850) 
	
	Collections.sort(list);
	list.forEach(s->System.out.println(s));
	
	System.out.println("Reverse Order");
	
	Collections.sort(list,Collections.reverseOrder());
	list.forEach(s->System.out.println(s));
	
	
}
}
