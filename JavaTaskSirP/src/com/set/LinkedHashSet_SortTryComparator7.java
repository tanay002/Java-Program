package com.set;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class LinkedHashSet_SortTryComparator7 
{
	public static void main(String[] args)
	{
		LinkedHashSet ls=new LinkedHashSet();
		Coaching2 c=new Coaching2(101,"Tanay",'A');
		Coaching2 c1=new Coaching2(80,"Rajat",'D');
		Coaching2 c2=new Coaching2(90,"KP",'C');
		Coaching2 c3=new Coaching2(75,"Dhruvi",'B');
		Coaching2 c4=new Coaching2(90,"KP",'C');
		ls.add(c);
		ls.add(c1);       //We can also sort data by comparator ..by using same process
		ls.add(c2);
		ls.add(c3);
		ls.add(c4);
		System.out.println("Unsorted Data:- \n"+ls);
		System.out.println("");
		
		TreeSet ts=new TreeSet(new SortByCoachingId());
		ts.addAll(ls);
		System.out.println("Sorted Data after using treeset: -\n"+ts);
		
		System.out.println("");
		TreeSet ts1=new TreeSet(new SortByCoachingName());
		ts1.addAll(ls);
		System.out.println("Sorted Data after using treeset: -\n"+ts1);

	}
}
//to avoid duplicate data we have to override hashcode and equals
//to print content of object so we have to ovverride toString
//To perform sorting we use treeSet and passed list of Hashset in treeset...we implements comparable and overrides compareTo method for sorting
class Coaching2
{
	int id;
	String name;
	char grade;
	Coaching2(int id,String name,char grade)
	{
		this.id=id;
		this.name=name;
		this.grade=grade;
	}
	public String toString()
	{
		return id+" "+name+" "+grade;	
	}

	public int compareTo(Object o)
	{
		Coaching2 c=(Coaching2)o;
		return this.name.compareTo(c.name);
	}

	public int hashCode()
	{
		return (id+""+name+""+grade).hashCode();
	}

	public boolean equals(Object o)
	{
		if(this.hashCode()==o.hashCode())
			return true;
		else
			return true;
	}
}

class SortByCoachingId implements Comparator
{
	public int compare(Object o1,Object o2)
	{
		Coaching2 c1=(Coaching2)o1;
		Coaching2 c2=(Coaching2)o2;
		return c1.id-c2.id;
	}
}

class SortByCoachingName implements Comparator
{
	public int compare(Object o1,Object o2)
	{
		Coaching2 c1=(Coaching2)o1;
		Coaching2 c2=(Coaching2)o2;
		return c1.name.compareTo(c2.name);
	}
}