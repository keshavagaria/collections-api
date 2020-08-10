package com.csi.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {
public static void main(String[] args) {
	Map<Integer,String> map=new HashMap<>();
	map.put(1, "vishal");
	map.put(1, "vishu");
	System.out.println(map.size());
	for(Map.Entry<Integer, String>m:map.entrySet())
	{
		System.out.println(m.getKey()+" "+m.getValue());
	}
}
}
