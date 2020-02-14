package com.sorting;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorTask
{
	public static void main(String[] args) 
	{
		CompartorTaskExecute t1=new CompartorTaskExecute(101,"Tanay","indore");
		CompartorTaskExecute t2=new CompartorTaskExecute(201,"Vinay","Bhopal");
		CompartorTaskExecute t3=new CompartorTaskExecute(150,"Virat","indore");
		
		
		ArrayList a=new ArrayList();
		a.add(t1);
		a.add(t2);
		a.add(t3);
		Collections.sort(a,new SortById());     //Collections ke pass overloaded sort method hai of 2 parameterized 
		Collections.sort(a,new SortById());
		System.out.println(a);
	}
}

class CompartorTaskExecute
{
	int id;
	String name;
	String city;

	CompartorTaskExecute(int id,String name,String city)
	{
		this.id=id;
		this.name=name;
		this.city=city;
	}

	public String toString()
	{
		return id+" "+name+" "+city;
	} 

}
class SortById implements Comparator   //equals is a abstract method of comparator interface,we implements body of this method in our class
{
	public int compare(Object o1,Object o2)
	{
		CompartorTaskExecute c1=(CompartorTaskExecute) o1;
		CompartorTaskExecute c2=(CompartorTaskExecute) o2;
		return c1.id-c2.id;
	}
}

class SortByName implements Comparator  
{
	public int compare(Object o1,Object o2)
	{
		CompartorTaskExecute c1=(CompartorTaskExecute) o1;
		CompartorTaskExecute c2=(CompartorTaskExecute) o2;
		return c1.name.compareTo(c2.name);
	}
}