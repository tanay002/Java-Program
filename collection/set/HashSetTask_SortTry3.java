package com.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;
//The best schenario is to use directly TreeSet insteads of using hashSet and then passing data of HashSet in TreeSet .......
//because HashSet does not preserves insertion order...and can't perform sorting in hashset using comparable and comparator.
class Employee1 implements Comparable
{
	int id;
	String name;

	Employee1(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	public String toString()
	{
		return id+" "+name;
	}
	public int compareTo(Object o)
	{
		Employee1 e=(Employee1)o;
		return this.id - e.id;
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
public class HashSetTask_SortTry3 
{

	public static void main(String[] args) 
	{
		Employee1 e=new Employee1(2,"Tanay");
		Employee1 e1=new Employee1(3,"Nikhil");
		Employee1 e2=new Employee1(4,"Priya");
		Employee1 e3=new Employee1(1,"Minal");
		Employee1 e4=new Employee1(2,"Tanay");
		HashSet s=new HashSet();
		s.add(e);
		s.add(e1);
		s.add(e2);
		s.add(e3);

		TreeSet s1=new TreeSet(s);
		System.out.println(s);
		System.out.println(s1);
		//we have to overite toString method to see content of user defined object passed in HashSet 
		//wrapper class ne toString class ko overrite karke rakha hai
		System.out.println("");
		Iterator it=s.iterator();
		while(it.hasNext())
		{
			System.out.print("Unsorted Data  "+it.next()+" ");
		}
		System.out.println(" ");
		for(Object o: s)
		{
			System.out.print("Unsorted Data  "+o+" ");
		}
	}

}
