package com.set;

import java.util.TreeSet;

public class TreeSetTask8 
{
	public static void main(String[] args) 
	{
		//We can use TreeSet for sorting homogeneous data......data must be of similar type
		//we can use same data ...i.e integer types,String type ,char type ,float,double....
		TreeSet s=new TreeSet();

		s.add(10);
		s.add(20);
		s.add(15);  //Integer type Data (i.e homogeneous Data)
		s.add(7); 
		s.add(13);
		s.add(1);
		s.add(20);
		s.add(7);
		System.out.println(s);
		System.out.println(" ");
		
		
		TreeSet s1=new TreeSet();
		s1.add("Tanay");
		s1.add("Nikhil");
		s1.add("Rohit");
		System.out.println(s1);


		/* s.add(null);     null pointer exception
 		/* s.add("Tanay");        class cast exception data must be homogeneous*/
	}
}
