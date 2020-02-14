package com.comparator;

import java.util.ArrayList;
import java.util.Comparator;

public class ComparatorTaskk
{
	int id;
	String name;

	public ComparatorTaskk(int id,String name) {

		this.id=id;
		this.name=name;
	}
	public String toString()
	{
		return ""+id+name;	
	}

	public static void main(String[] args) 
	{
		ComparatorTaskk t=new ComparatorTaskk(101,"tanay");
		ComparatorTaskk t1=new ComparatorTaskk(85,"ravi");
		ComparatorTaskk t2=new ComparatorTaskk(90,"raja");
		ArrayList a=new ArrayList();
		a.add(t);
		a.add(t1);
		a.add(t2);

	}
}

class SortById implements Comparator
{
	public int compare(Object o1,Object o2)
	{
		ComparatorTaskk s1=(ComparatorTaskk) o1;
		ComparatorTaskk s2=(ComparatorTaskk) o2;
		return (s1.id).compareTo(s2.id);
	}
}
