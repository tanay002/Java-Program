package com.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetTask1 
{
	public static void main(String[] args) 
	{
		Set s=new HashSet();
		s.add(10);
		s.add(20);
		s.add(13);
		s.add(21);
		s.add(20);
		s.add(21);   //
		s.add(null);
		s.add('d');
		s.add(25);
		s.add("Tanay");
		Iterator it=s.iterator();
		
		while(it.hasNext())
		{
			System.out.print(it.next()+" ");
		}
		System.out.println("");
		for(Object o:s)
		{
			System.out.print(o+" ");
		}
	}
}
