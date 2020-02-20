package com.Arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
class Employee
{
	int id;
	String name;

	Employee(int id,String name)
	{
		this.id=id;
		this.name=name;
	}

	public String toString()
	{
		return id+" "+name;
	}

}
public class Arraylist2
{
	public static void main(String[] args) 
	{   ArrayList a=new ArrayList();
	Scanner sc=new Scanner(System.in);
	System.out.println("Kitne Data insert Karna hai:- ");
	int size=sc.nextInt();
	System.out.println("Enter id and name:-\n");
	for(int i=0;i<size;i++)
	{
		Employee e=new Employee(sc.nextInt(),sc.next());

		a.add(e);
	}

	System.out.println("Iterator");
	Iterator it=a.iterator();
	while(it.hasNext())
	{
		System.out.println(it.next());
	}
	System.out.println("");

	System.out.println("Enhanced loop");
	for(Object o:a)
	{
		System.out.println();
	}
	System.out.println();
	System.out.println("Using Get method");
	for(int i=0;i<size;i++)
	{
		System.out.println(a.get(i));
	}
	System.out.println();
	System.out.println("toString");
	System.out.println(a);
	}
}
