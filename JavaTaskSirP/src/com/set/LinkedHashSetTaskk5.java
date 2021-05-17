package com.set;

import java.util.LinkedHashSet;

public class LinkedHashSetTaskk5
{
	public static void main(String[] args) 
	{
		StudentCollege s=new StudentCollege(102,"Rajat Bansal");
		StudentCollege s1=new StudentCollege(90,"Deepak khurana");
		StudentCollege s2=new StudentCollege(105,"Jayraj Agnihotri");
		StudentCollege s3=new StudentCollege(75,"Devesh Malhotra");
		StudentCollege s4=new StudentCollege(90,"Deepak khurana");  //we know that set does not allowed duplication..
		LinkedHashSet ls=new LinkedHashSet();   //we can't add duplicate data...so this schenario fails because when we iterate data it will display...
		ls.add(s);           //duplicate data... //so to avoid duplicate data  we have to override hashcode and equals method....                             
		ls.add(s1);               
		ls.add(s2);
		ls.add(s3);
		ls.add(s4);
		System.out.println(ls);
	}
}

class StudentCollege
{
	int id; 
	String name;
	public StudentCollege(int id,String name) 
	{
		this.id=id;
		this.name=name;
	}	
	public String toString()
	{
		return id+" "+name;
	}
}