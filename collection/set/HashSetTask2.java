package com.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeMap;

class Employee
{
	int id;
	String name;

	Employee(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	public String toString()
	{
		return id+" "+name;
	}
}
public class HashSetTask2 
{

	public static void main(String[] args) 
	{
		Employee e=new Employee(2,"Tanay");
		Employee e1=new Employee(3,"Nikhil");//schenario fail.....we know that set me duplicate data nhi aata ..par abhi aa rha hai....
		Employee e2=new Employee(4,"Priya"); //so we have to override hashCode and equals method to avoid duplicate data of an object
		Employee e3=new Employee(1,"Minal"); 
		Employee e4=new Employee(4,"Priya");
		HashSet s=new HashSet();
		s.add(e);
		s.add(e1);
		s.add(e2);
		s.add(e3);
		s.add(e4);
		System.out.println(s); //we have to overrite toString method to see content of user defined object passed in HashSet 
		               //wrapper class ne toString class ko overrite karke rakha hai
		System.out.println("");
		Iterator it=s.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println("");
		for(Object o: s)
		{
			System.out.println(o);
		}

	}
}
