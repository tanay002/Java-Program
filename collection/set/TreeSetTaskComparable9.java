package com.set;

import java.util.Scanner;
import java.util.TreeSet;

class Car implements Comparable
{
	int modelNo;	
	String name;

	Car(int modelNo,String name)
	{
		this.modelNo=modelNo;
		this.name=name;
	}
  public String toString()
  {
	  return modelNo+" "+name;
  }
	public int compareTo(Object o)
	{
		Car c= (Car) o;
		return this.name.compareTo(c.name);
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

public class TreeSetTaskComparable9 
{
	public static void main(String[] args) 
	{
		System.out.println("Kitna Data insert karna hai:- ");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		System.out.println("Enter modeiNo and Car Name");	
		TreeSet set=new TreeSet();
		for(int i=0;i<size;i++)
		{
			Car c=new Car(sc.nextInt(),sc.next());	
			
			set.add(c);	
		}
		System.out.println(set);
	}
}