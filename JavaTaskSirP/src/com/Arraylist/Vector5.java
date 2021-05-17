package com.Arraylist;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class Vector5
{
	public static void main(String[] args)
	{
		Vector v=new Vector();
		v.add("Tanay");
		v.add("Student");
		v.add(102);
		v.add('c');
		v.add(12.00f);
		v.add(14.0d);
		
		Enumeration e=v.elements();
		v.add(204);
		v.add(107);           //we can add data after elements is bind.....
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
		
		System.out.println("");
		Iterator it=v.iterator();
		v.add("kp");  //itearor agar use karte hai to concurrent modification exception aa jayegi 
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
}
