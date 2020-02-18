package com.SynchronizeCollection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArraylistReadOnly2
{
	public static void main(String[] args) 
	{
		ArrayList ls=new ArrayList();
		ls.add("Mango");
		ls.add("Orange");
		ls.add("Banana");
		ls.add("Papaya");
		ls.add("Guava");
		/* Collection l = Collections.unmodifiableCollection(ls); */
		      Collection l=Collections.unmodifiableList(ls);   //If we pass arraylist in static method of collections i.e unmodifiableCollection,return type of this method is Collection ,
		                                                           //jo list hame milegi uske baad hum usme data add nhi kar sakte....if we are trying to add  it will return
		                                                             //UnsupportedOperationException
		/*
		 * l.add("Grapes"); l.add("Sitafal");
		 */ //java.lang.UnsupportedOperationException
		System.out.println(l);
		
		for(Object o:ls)
		{
			System.out.println(o);
		}
		
		int s=ls.size();
		
		  for(int i=0;i<s;i++) { System.out.println(ls.get(i)); }
		 
		
		
	}
}
