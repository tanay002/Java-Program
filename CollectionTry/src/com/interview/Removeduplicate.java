package com.interview;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Removeduplicate 
{ 
	String name;

	public Removeduplicate(String name) 
	{
		this.name=name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String toString()
	{
		return name;
	}
	public int hashCode()
	{
		return (name).hashCode();
	}
	
	public boolean equals(Object o)
	{
		if(o.hashCode()==this.hashCode())
			return true;
		else
			return false;
	}
	public static void main(String[] args) 
	{

		List s=new ArrayList();

		s.add(20);
		s.add(10);
		s.add(54);
		s.add(10);

		List l=(List) s.stream().distinct().collect(Collectors.toList());

		List s1=new ArrayList();

		s1.add(new Removeduplicate("Tanay"));
		s1.add(new Removeduplicate("Raju"));
		s1.add(new Removeduplicate("Raxx"));
		s1.add(new Removeduplicate("Tanay"));
		List <Removeduplicate> ll=(List<Removeduplicate>) s1.stream().distinct().collect(Collectors.toList());
		System.out.println(ll);
		

	}
}
