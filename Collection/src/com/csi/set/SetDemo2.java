package com.csi.set;

import java.util.Set;
import java.util.TreeSet;

public class SetDemo2 {
public static void main(String[] args) {
	Set<String> set=new TreeSet<String>();
	set.add("Amit");
	set.add("Ravi");
	set.add("Ankit");
	//set.add(null);
	set.add("Anjali");


for(String s:set)
{
	System.out.println(s);
}
}
}