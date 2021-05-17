package com.string;
final class Student
{
	private final int id;	
	private final String name;
	private final Address add;
	public int getId() 
	{
		return id;
	}
	public String getName() {
		return name;
	}
   
	public Address getAdd() {
		return add;
	}
	
	public String toString()
	{
		
		return id+" "+name+" "+add;
	}
	Student(int id,String name,Address add) throws CloneNotSupportedException
	{
		this.id=id;
		this.name=name;
		this.add=(Address)add.clone();
	}
}

public class String1 
{
	public static void main(String[] args) throws CloneNotSupportedException 
	{
		Address a=new Address("Indore");
		Student s=new Student(101, "Tanay",a);
		System.out.println(s);
		a.city="Bhopal";
		System.out.println(s);
	
	}
}
