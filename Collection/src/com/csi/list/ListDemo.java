package com.csi.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo {
public static void main(String[] args) {
	List<String> list=new ArrayList<>();
	list.add("Ravi");
	list.add("Amit");
	list.add("Vishal");
	list.add(null);
	list.add("Amit");
	list.add(null);
	
	for(String s:list)
	{
		System.out.print(s+" ");
	}
	System.out.println("\n");
	
	for(int i=0;i<list.size();i++)
	{
		System.out.print(list.get(i)+" ");
	}
	
	System.out.println("\n");

	Iterator<String> itr=list.iterator();
	while(itr.hasNext())
	{
		System.out.print(itr.next()+" ");
	}
	
	System.out.println("\n");
	
	list.forEach(s->{System.out.print(s+" ");});
}
}                                                 																												
