package com.csi.set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {
public static void main(String[] args) {
	
	Set<String> set=new LinkedHashSet<String>();
	set.add(null);
	set.add("One");
	set.add("Four");
	set.add("Five");
	set.add("Five");
	set.add("Two");
	set.add(null);
	
	set.forEach(s->System.out.println(s));
}
}
