package com.map;

import java.util.Comparator;
import java.util.TreeMap;

class Coaching12
{
	int id;
	String name;
	Coaching12(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	public String toString()
	{
		return id+" "+name;
	}

}

class SortByIdd implements Comparator
{
	
	public int compare(Object o1,Object o2)
	{
		Coaching12 c1=(Coaching12) o1;
		Coaching12 c2=(Coaching12) o2;
		return c1.id-c2.id;
		
	}
}

class SortByNamee implements Comparator
{
	
	public int compare(Object o1,Object o2)
	{
		Coaching12 c1=(Coaching12) o1;
		Coaching12 c2=(Coaching12) o2;
		return c1.name.compareTo(c2.name);
		
	}
}
public class TreeMap9
{
	public static void main(String[] args) 
	{
		Coaching12 c=new Coaching12(4,"Tanay");
		Coaching12 c1=new Coaching12(3,"Rajat");
		Coaching12 c3=new Coaching12(9,"Monu");
		Coaching12 c4=new Coaching12(8,"Nikhil");
		Coaching12 c5=new Coaching12(4,"Tanay");
		TreeMap t=new TreeMap(new SortByNamee());
		t.put(c,1);
		t.put(c1,5);
		t.put(c5,8);
		t.put(c3,13);
		t.put(c4,15);
		System.out.println(t);
	}
}
