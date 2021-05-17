package com.set;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

class CarFeature
{
	int modelNo;	
	String name;

	CarFeature(int modelNo,String name)
	{
		this.modelNo=modelNo;
		this.name=name;
	}
	public String toString()
	{
		return modelNo+" "+name;
	}

	public int hashCode()
	{
		return (""+modelNo+name).hashCode();	
	}

	public  boolean equals(Object o)
	{
		if(this.hashCode()==o.hashCode())
			return true;
		else 
			return false;
	}
}

class SortByCarName implements Comparator
{
	public int compare(Object o,Object o2)
	{
		CarFeature c= (CarFeature) o;
		CarFeature c1= (CarFeature) o2;
		return c.name.compareTo(c1.name);
	}

}

class SortByModelNo implements Comparator
{
	public int compare(Object o,Object o2)
	{
		CarFeature c= (CarFeature) o;
		CarFeature c1= (CarFeature) o2;
		return c.modelNo-c1.modelNo;
	}

}

public class TreeSetTaskComparator10
{
	public static void main(String[] args) 
	{   	
		System.out.println("Kitna Data insert karna hai:- ");
		CarFeature c=null;
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		System.out.println("Pick Sorting Based:-\n 1:ModelNo \n2:Name");
		int choice=sc.nextInt();
		System.out.println("Enter modeiNo and Car Name");	
		switch(choice)
		{
		case 1:        	
			TreeSet set=new TreeSet(new SortByModelNo());
			for(int i=0;i<size;i++)
			{
				c=new CarFeature(sc.nextInt(),sc.next());	
				set.add(c);	
			}
			System.out.println(set);
			break;

		case 2:        	
			TreeSet set1=new TreeSet(new SortByCarName());
			for(int i=0;i<size;i++)
			{
				c=new CarFeature(sc.nextInt(),sc.next());	
				set1.add(c);	
			}
			System.out.println(set1);
			break;
		default : System.out.println("Invalid Choice:- ");

		}
	}
}