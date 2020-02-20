package com.Arraylist;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

class Student
{
	int id;
	String name;
	Student(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	public String toString()
	{
		return id+" "+name;
	}
/*	
	public int hashCode()
	{
		return (id+" "+name).hashCode();
	}
	public boolean equals(Object o)
	{
		if(this.hashCode()==o.hashCode())
			return true;
		else 
			return false;
	}        */
}
public class Vector6 
{
	public static void main(String[] args)
	{
		Student k=new Student(201,"Kaka");
		Student  v1=new Student (401,"Raka");
		Student v2=new Student(501,"Shaka");
		Student v3=new Student(501,"Shaka");
		
		Vector v=new Vector();
		v.add(k);
		v.add(v1);
		v.add(v2);
		v.add(v3);
		
		Enumeration e=v.elements();
		
		//we can add data after elements is bind.....
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}

		/*
		 * System.out.println(""); Iterator it=v.iterator(); v.add("kp"); //itearor agar
		 * use karte hai to concurrent modification exception aa jayegi
		 * while(it.hasNext()) { System.out.println(it.next()); }
		 */
	}
}
