package com.collections;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableSorting implements Comparable
{
	int id;
	 String name;

	public ComparableSorting(int id,String name) {
		this.id=id;
		this.name=name;
	}

	public String toString()
	{
		return id+" "+name;	
	}

	public int compareTo(Object o)
	{
		ComparableSorting c=(ComparableSorting) o;	
	//	return this.id-c.id;
		return this.name.compareTo(c.name);
	}
	
	public static void main(String[] args) 
	{
	  ComparableSorting c=new ComparableSorting(102,"Tanay");
	  ComparableSorting c1=new ComparableSorting(53,"Vinay");
	  ComparableSorting c2=new ComparableSorting(70,"Ranjeet");
	  ComparableSorting c3=new ComparableSorting(90,"Sourabh");
	  ComparableSorting c4=new ComparableSorting(20,"Rahul");
	  
	  ArrayList a=new ArrayList();
	  a.add(c);
	  a.add(c1);
	  a.add(c2);
	  a.add(c3);
	  a.add(c4);
	  System.out.println(a);
	  Collections.sort(a);
System.out.println(a);
	}
}
