package com.collection;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;
import java.util.concurrent.CopyOnWriteArrayList;

public class Arraylistt 
{
public static void main(String[] args) {
	

	//CopyOnWriteArrayList lst2=new CopyOnWriteArrayList();
	List lst2=new ArrayList(2);
	lst2.add(20);
	lst2.add(21);
	lst2.add(22);
	lst2.add(24);
	//Vector v=new Vector(lst2);
	//System.out.println("size= "+lst2.size());
	
/*
	 Iterator it =lst2.iterator();
	  lst2.add(28);
	   it =lst2.iterator();
	  while(it.hasNext())
	  {
		  System.out.println(it.next());
	  }
	*/
	
	ListIterator list=lst2.listIterator();  //failsafe
	list.add(19);
	list=lst2.listIterator();
	while(list.hasNext())
	{
		System.out.println(list.next());
	}
	System.out.println("");
	while(list.hasPrevious())
	{
		System.out.println(list.previous());
	}
	
	
}
}
