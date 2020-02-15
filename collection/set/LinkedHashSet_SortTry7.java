package com.set;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class LinkedHashSet_SortTry7 
{
	public static void main(String[] args)
	{
		LinkedHashSet ls=new LinkedHashSet();
		Coaching c=new Coaching(101,"Tanay",'A');
		Coaching c1=new Coaching(80,"Rajat",'D');
		Coaching c2=new Coaching(90,"KP",'C');
		Coaching c3=new Coaching(75,"Dhruvi",'B');
		Coaching c4=new Coaching(90,"KP",'C');
		ls.add(c);
		ls.add(c1);
		ls.add(c2);
		ls.add(c3);
		ls.add(c4);
		TreeSet ts=new TreeSet(ls);
		System.out.println("Unsorted Data:- \n"+ls);
		System.out.println("");
		System.out.println("Sorted Data after using treeset: -\n"+ts);

	}
}
//to avoid duplicate data we have to override hashcode and equals
//to print content of object so we have to ovverride toString
//To perform sorting we use treeSet and passed list of Hashset in treeset...we implements comparable and overrides compareTo method for sorting
class Coaching implements Comparable
{
	int id;
	String name;
	char grade;
	Coaching(int id,String name,char grade)
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
		Coaching c=(Coaching)o;
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