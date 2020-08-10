package com.csi.map;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {
public static void main(String[] args) {
	Map<Integer,String> map=new TreeMap<Integer, String>();
	map.put(5, "Ravi");
	map.put(4, "Queen");	
	map.put(3, "Prashant");
	map.put(2, "Owaish");
	//map.put(null, "Nitin");
	map.put(7, null);
	map.put(6, null);
	
	map.put(8, "Nitin");


for(Map.Entry<Integer, String>m:map.entrySet())
{
	System.out.print(m.getKey()+":"+m.getValue()+"   ");
}
}
}
