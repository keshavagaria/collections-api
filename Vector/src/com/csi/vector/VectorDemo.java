package com.csi.vector;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorDemo {
public static void main(String[] args) {
	Vector<String> v=new Vector<>();
	v.add("One");
	v.add("Two");
	v.add("One");
	v.add("Three");
	v.add("Four");
	v.add("Five");
	v.add("Six");
	v.add("Four");
	v.add("Five");
	v.add("Six");
	v.add("Six");
	System.out.println(v.capacity());
	System.out.println("By Iterator");
		
	Iterator<String> itr=v.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	
	
	System.out.println("\n");
	System.out.println("By Enumerator");
	Enumeration<String>e=v.elements();
	while(e.hasMoreElements())
	{
		System.out.println(e.nextElement());
	}
} 


}
