package com.polymorphism_concept;

//We cannot override final,private and static methods
class Student
{
	/*final */void demo()
	{
		System.out.println("parent ones");
	}

	/*static*/ void demo2()
	{
		System.out.println("parent ones");
	}
}

class Interviewer extends Student
{
	void demo()
	{
		System.out.println("child ones");
	}

	void demo2()  //This instance method cannot override the static and final method from Student
	{
		System.out.println("child ones");
	}
}
public class Overriding_Final 
{
	public static void main(String[] args) 
	{
		Student s=new Interviewer();
		s.demo();
	}
}
