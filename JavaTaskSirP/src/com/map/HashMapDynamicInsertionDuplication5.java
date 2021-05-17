package com.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

class Employee2
{
	int id;
	String name;

	Employee2(int id,String name)
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
		return (id+""+name).hashCode();
	}
	public boolean equals(Object o)
	{
		if(this.hashCode()==o.hashCode())
			return true;
		else 
			return false;
	}
}
public class HashMapDynamicInsertionDuplication5 
{
	public static void main(String[] args) 
	{  
		HashMap hm=new HashMap();
		Employee2 emp=null;
		System.out.println("kitna Data insert karna");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		System.out.println("Enter id and Name");
		for(int i=1;i<=size;i++)
		{
			emp=new Employee2(sc.nextInt(),sc.next()); 
			hm.put(emp,i);
		}

		Set s =hm.entrySet();
		Iterator it =s.iterator();
		System.out.println("Data is:- ");
		while(it.hasNext())
		{
			Map.Entry mp=(Map.Entry) it.next();
			System.out.println(mp.getKey()+" "+mp.getValue());
		}
	}
}
