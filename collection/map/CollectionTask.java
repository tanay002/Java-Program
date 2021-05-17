package com.Stringg;

import java.util.HashMap;

class Student
{
	int rollno;
	Student(int rollno)
	{
		this.rollno=rollno;	
	}
	
	public String toString()
	{
		return ""+rollno;
	}
	
	public int hashCode()
	{
		return (""+rollno).hashCode();
	}
	
	public boolean equals(Object o)
	{
		if(this.hashCode()==o.hashCode())
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
public class CollectionTask 
{
public static void main(String[] args) {
	Student s=new Student(10);
	Student s1=new Student(10);
	HashMap h=new HashMap();
	h.put(s, "Tanay");
	h.put(s1,"Saxena");
	System.out.println(h);
}
}
