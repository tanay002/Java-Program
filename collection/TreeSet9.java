package com.collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet9 
{
	public static void main(String[] args) 
	{
		TreeSet ts=new TreeSet();
		ts.add(7);
		ts.add(10);
		ts.add(70);
		ts.add(65);
		//ts.add("cool");  //If we add other primtive type except Integer it will gives java.lang.ClassCastException
		//i.e java.lang.Integer cannot be cast to java.lang.String
		ts.add(20);
		ts.add(35);
		ts.add(15);

		Iterator it=ts.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());	
		}
	}
}
