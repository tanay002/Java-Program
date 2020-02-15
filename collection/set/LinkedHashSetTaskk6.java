package com.set;

import java.util.LinkedHashSet;
//To avoid duplicate data in an object we have to override hashcode and equals method.../
public class LinkedHashSetTaskk6
{
	public static void main(String[] args) 
	{
		StudentCollege2 s=new StudentCollege2(102,"Rajat Bansal");
		StudentCollege2 s1=new StudentCollege2(90,"Deepak khurana");
		StudentCollege2 s2=new StudentCollege2(105,"Jayraj Agnihotri");
		StudentCollege2 s3=new StudentCollege2(75,"Devesh Malhotra");
		StudentCollege2 s4=new StudentCollege2(90,"Deepak khurana");
		LinkedHashSet ls=new LinkedHashSet();
		ls.add(s);
		ls.add(s1);
		ls.add(s2);
		ls.add(s3);
		ls.add(s4);
		System.out.println(ls);
	}
}

class StudentCollege2
{
	int id; 
	String name;
	public StudentCollege2(int id,String name) 
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
		return (id+" "+name).hashCode();	
	}

	public boolean equals(Object o)
	{
		if(this.hashCode()==o.hashCode())
			return true;
		else 
			return false;
	}
}