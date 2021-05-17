package com.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

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
public class HashMapDynamicInsertion4 
{
	public static void main(String[] args) 
	{  
		HashMap hm=new HashMap();
		Employee emp=null;
		System.out.println("kitna Data insert karna");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		System.out.println("Enter id and Name");
		for(int i=1;i<=size;i++)
		{
			emp=new Employee(sc.nextInt(),sc.next()); 
			hm.put(i,emp);
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
