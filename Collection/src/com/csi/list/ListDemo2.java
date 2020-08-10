package com.csi.list;

import java.util.LinkedList;
import java.util.List;

public class ListDemo2 {
public static void main(String[] args) {
	List<String> list=new LinkedList<String>();
	list.add("Ravi");
	list.add("Vishal");
	list.add("Tom");
	list.add("Hitesh");
	list.add(null);
	list.add("Hitesh");
	list.add(null);

	

for(String s:list)
{
	System.out.print(s+" ");
}
}
}