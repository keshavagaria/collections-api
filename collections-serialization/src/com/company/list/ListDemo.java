package com.company.list;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class ListDemo {
public static void main(String[] args) throws IOException, ClassNotFoundException {
	
	List<String> list=new ArrayList<>();
	list.add("one");
	list.add("two");
	list.add("three");
	
	FileOutputStream fos=new FileOutputStream("List.txt");
	ObjectOutputStream oos=new ObjectOutputStream(fos);
	oos.writeObject(list);
	
	FileInputStream fis=new FileInputStream("List.txt");
	ObjectInputStream ois=new ObjectInputStream(fis);
	ArrayList<String> arrayList=(ArrayList<String>) ois.readObject();
	System.out.println(arrayList);
}
}
