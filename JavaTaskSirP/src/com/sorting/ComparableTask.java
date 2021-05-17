package com.sorting;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableTask
{

	public static void main(String[] args) 
	{
		Student s=new Student(2);
		Student s1=new Student(9);
		Student s2=new Student(5);

              ArrayList a=new ArrayList();
              a.add(s);
              a.add(s1);
              a.add(s2);
              System.out.println(a);
              Collections.sort(a);
              System.out.println(a);
              
}
}
class Student implements Comparable
{
	int id;
	Student(int id)	
	{
		this.id=id;
	}
	public String toString()
	{
		return ""+id;	
	}

	public int compareTo(Object o)
	{
		Student s=(Student)o;
		return this.id-s.id;
	}

}
