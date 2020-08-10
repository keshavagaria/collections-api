package com.csi.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapDemo {
public static void main(String[] args) {
	Map<Integer,String> map=new HashMap<Integer,String>();
	map.put(1, "Vishal");
	map.put(2, "Amit");
	map.put(3, "Ankit");
	map.put(4, "Ravi");
	map.put(5, "Kunal");
	map.put(5, "Keshav");
	map.put(null, "KumKum");
	map.put(null, "Kavita");
	map.put(6, null);
	map.put(7, null);


for(Map.Entry<Integer,String> m:map.entrySet())
{
	System.out.print(m.getKey()+":"+m.getValue()+"   ");
}

System.out.println("\n");


Iterator<Map.Entry<Integer, String>> itr=map.entrySet().iterator();
while(itr.hasNext())
{
	System.out.print(itr.next()+"  ");
}

System.out.println("\n");
map.forEach((K,V)->System.out.print(K+":"+V+"  "));
}
}
