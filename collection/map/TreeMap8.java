package com.map;

import java.util.TreeMap;

class Coaching implements Comparable
{
	int id;
	String name;
	Coaching(int id,String name)
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
Coaching c=(Coaching) o;
return this.id-c.id;
}


}
public class TreeMap8
{
	public static void main(String[] args) 
	{
		Coaching c=new Coaching(4,"Tanay");
		Coaching c1=new Coaching(3,"Rajat");
		Coaching c3=new Coaching(9,"Monu");
		Coaching c4=new Coaching(8,"Nikhil");
		Coaching c5=new Coaching(4,"Tanay");
    TreeMap t=new TreeMap();
    t.put(c,1);
    t.put(c1,5);
    t.put(c5,8);
    t.put(c3,13);
    t.put(c4,15);
    System.out.println(t);
	}
}
