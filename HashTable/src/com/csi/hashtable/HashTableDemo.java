package com.csi.hashtable;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

public class HashTableDemo {
public static void main(String[] args) {
	Hashtable<Integer, String> ht=new Hashtable<Integer, String>();
	ht.put(101, "TOM CRUISE");
	ht.put(51, "TOM HARDY");
	ht.put(41, "CRISTIAN BALE");
	ht.put(201, "KEANU REEVES");
	ht.put(100, "GEORGE CLOONEY");
	//ht.put(null, "TOBEY");
	//ht.put(5, null);

	//ht.put(6, null);

	System.out.println("By Iterator");
Iterator<Map.Entry<Integer, String>> itr=ht.entrySet().iterator();
while(itr.hasNext())
{
	System.out.println(itr.next());
}

System.out.println("\n");
System.out.println("By Enumerator");

Enumeration<Integer>e=ht.keys();
while(e.hasMoreElements())
{
	Integer keys=e.nextElement();
	System.out.println(keys+"="+ht.get(keys));
}
}
}
