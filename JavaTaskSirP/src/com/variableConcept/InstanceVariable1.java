package com.variableConcept;
//for every object a separate copy of instance variable will be created for instance variable
//Instance variable will be created at the time of object creation and destroyed at the time of object destruction
//Instance variables will be stored in the heap memory as a part of object

public class InstanceVariable1
{ 
	int id;
	String name;
	char c;
	float per;
	double val;
	short v;
	byte b;
	long kp;
	//for instance variables jvm will always provide default values,and we are not required to perform intialization explicitly
	public void m1()
	{
		System.out.println(id);  //we can access instance variables directly from instance area
	}
	public static void main(String[] args)
	{
		InstanceVariable1 v=new InstanceVariable1();
		System.out.println(v.id+" "+v.name+" "+v.c);
		System.out.println(v.per+" "+v.val+" "+v.v);
		System.out.println(v.b+" "+v.kp);


		/* (Cte)  System.out.println(id); */ //we can't access instance variable directly from static area,but we can access by using object reference
	}
}
