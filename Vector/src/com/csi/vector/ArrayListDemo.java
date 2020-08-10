package com.csi.vector;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
public static void main(String[] args) {
	
	List<String> list=new ArrayList<>(6);
	System.out.println(list.size());
	list.add("one");
	list.add("two");
	list.add("three");
	list.add("four");
	list.add("five");
	list.add("six");
	list.add("seven");
	
	System.out.println(list.size());
}
}
