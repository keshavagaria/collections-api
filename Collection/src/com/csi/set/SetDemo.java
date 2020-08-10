package com.csi.set;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
public static void main(String[] args) {
	
	Set<String> set=new HashSet<String>();
	set.add("Amit");
	set.add("Ravi");
	set.add(null);
	set.add("Rahul");
    set.add(null);

for(String s:set)
{
	System.out.print(s+" ");
}
}
}