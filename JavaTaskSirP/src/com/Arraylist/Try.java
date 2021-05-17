package com.Arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Try 
{
	public static void main(String[] args) 
	{
    List a=new LinkedList();
    a.add("Tanay");
    a.add("Saxena");
    a.add("Dhruv");
    a.add(102);
    a.add(14.0f);
    a.add('d');
    a.add("Saxena");
		/*
		 * int size=a.size();
		 * 
		 * System.out.println("Using Get method"); for(int i=0;i<size;i++) {
		 * System.out.println(a.get(i)); }
		 */
//System.out.println(a.getLast());
      ListIterator it= a.listIterator();
	while (it.hasNext()) {
		System.out.println(it.next());
		
	}
	}
	
}
