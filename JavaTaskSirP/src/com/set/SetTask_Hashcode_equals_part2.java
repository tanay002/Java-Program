package com.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeMap;

class Employee2
{
	int id;
	String name;

	Employee2(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	public String toString()
	{
		return id+" "+name;
	}
	  public int hashCode()
	  {
		  return (id+""+name).hashCode();
	  }
	  
	  public boolean equals(Object o)
	  {
		  if(this.hashCode()==o.hashCode())
			  return true;
		  else
			  return false;
	  }
}
public class SetTask_Hashcode_equals_part2
{

	public static void main(String[] args) 
	{
		Employee2 e=new Employee2(2,"Tanay");
		Employee2 e1=new Employee2(3,"Nikhil");
		Employee2 e2=new Employee2(4,"Priya"); //we have to override hashcode and equals method to avoid duplicate data of an object
		Employee2 e3=new Employee2(1,"Minal");  
		Employee2 e4=new Employee2(4,"Priya");
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
