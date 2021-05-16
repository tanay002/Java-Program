package com.iterate.collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;
import java.util.concurrent.CopyOnWriteArrayList;

public class VectorTry
{
	public static void main(String[] args) throws ClassNotFoundException
	{
		int num=0;
		System.out.println(Class.forName("String").getName());
		CopyOnWriteArrayList c=new CopyOnWriteArrayList();
		c.add(10.0);
		c.add(20.9);
		c.add(30.7);


		Iterator it=c.iterator();
		c.add(70);
		while (it.hasNext()) {
			//c.remove(1);
		it.remove();
			System.out.println(it.next());

		}
		System.out.println(c);
	}
}
