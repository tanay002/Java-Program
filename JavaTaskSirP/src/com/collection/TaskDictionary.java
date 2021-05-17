package com.collection;

import java.util.ArrayList;
import java.util.List;

public class TaskDictionary {
public static void main(String[] args) {
	
	List l=new ArrayList();
	l.add(20);
	l.add(30);
	l.add(25);
	l.add(40);
	l.add(50);
	l.remove(new Integer(40));
	l.remove(2);
	System.out.println(l);
	List l2=new ArrayList();
}
}