package com.constructor;
public class Bytecoder
{
public static void main(String[] args) 
{
Student s=new Student(10,"tanay");
Student s1=new Student(20,"tanny");
System.out.println(s1.getId()+" "+s1.getName());
}	
	}

class Student
{
private int id;
private String name;

public Student(int id,String name)
{
	super();
	this.id=id;
	this.name=name;
	
}

public int getId() {
	return id;
}

public String getName() {
	return name;
}

}
