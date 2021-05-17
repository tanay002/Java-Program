package com.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
class Student
{
	String name;
	int rollno;

	Student(String name,int rollno)
	{
		this.name=name;
		this.rollno=rollno;
	}
	public String toString()
	{
		return name+" "+rollno;
	}
}
public class Listt 
{
	public static void main(String[] args) {
		LinkedList al=new LinkedList();
		Student s=new Student("rahul", 12);
		Student s1=new Student("Tanay", 112);
		Student s2=new Student("Ranjeet", 132);
		
		Student s23=new Student("kalua", 162);
		
		al.add(s);
		al.add(s1);
		al.add(s2);
		
		

       Iterator it= al.iterator();
        while(it.hasNext())
        {  //it.add(s23);
        	it.remove();
        	System.out.print(" "+it.next());
        	
        
        	
        }
	}
}
