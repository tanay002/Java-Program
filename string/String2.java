package com.string;

import java.util.ArrayList;
import java.util.List;

final class Student1
{
	private final int id;	
	private final String name;
	private final ArrayList<Address2> add;
	public int getId() 
	{
		return id;
	}
	public String getName() {
		return name;
	}
   
	public ArrayList<Address2> getAdd() {
		return add;
	}
	
	public String toString()
	{
		
		return id+" "+name+" "+add;
	}
	Student1(int id,String name,ArrayList<Address2> a) throws CloneNotSupportedException
	{
		this.id=id;
		this.name=name;
		this.add=(ArrayList<Address2>)a.clone();
	}
}

public class String2 
{
	public static void main(String[] args) throws CloneNotSupportedException 
	{
		Address2 a=new Address2("Indore");
		Address2 a1=new Address2("Bhopal");
		Address2 a2=new Address2("Pune");
ArrayList<Address2> ad=new ArrayList<Address2>();
ad.add(a);
ad.add(a1);
ad.add(a2);
		
		Student1 s=new Student1(101, "Tanay",ad);
		System.out.println(s);
		Address2 a3=new Address2("Mumbai");
		ad.add(a3);
		System.out.println(s);
	}
}
