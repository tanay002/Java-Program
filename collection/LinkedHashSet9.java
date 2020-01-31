package com.collections;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSet9
{
	public static void main(String[] args) 
	{
		LinkedHashSet lhs=new LinkedHashSet();
		lhs.add(10);
		lhs.add(20);
		lhs.add(30);
		lhs.add(null);
		lhs.add('c');
		lhs.add("Tanay");

		Iterator it=lhs.iterator();
   
		/*lhs.add("cool");*/  //ConcurrentModificationException
		while(it.hasNext())
		{
			System.out.print(it.next()+" ");
		}

	}
}
