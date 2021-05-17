package com.collections;

import java.util.ArrayList;
import java.util.Vector;

public class VectorTask 
{
public static void main(String[] args) {
	ArrayList a=new ArrayList();
	a.add(20);
	a.add(15);
	a.ensureCapacity(2);
	ArrayList a1=new ArrayList();
	a1.add(20);
	a1.add(30);
	System.out.println(a.containsAll(a1));
	System.out.println(a.contains(30));
	Vector v=new Vector();
	v.add("tanay");
	v.add("saxena");
	v.add(20);
	
	System.out.println(v);
	
	                v.add(1,"saaaa");
	                v.addAll(a);
	                v.addElement(a1);
	             ////   v.contains(o)
	            //    containsAll
	                System.out.println("djdjjdj  "+v.elementAt(2));
	                 
	                System.out.println(v.capacity());
	for(Object o:v)
	{
		System.out.println(o);
	}
	
	for(int i=0;i<v.size();i++)
	{
		System.out.println(v.get(i));
	}
}
}
