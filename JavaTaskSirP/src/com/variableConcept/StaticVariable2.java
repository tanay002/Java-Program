package com.variableConcept;
//In case of instance variables for every object a seperate copy  will be created but in the case of static variable a single copy will
//be created at class level shared by every object of the class
public class StaticVariable2 
{
	static int val=20;

	public void m1()//same class accessing static variable directly
	{
     System.out.println(val);
	}

	public static void main(String[] args)
	{
		StaticVariable2 s=new StaticVariable2();
		System.out.println(s.val);
		System.out.println(StaticVariable2.val); //recommended for static variable if accessing for other class
		
     System.out.println(val);//same class accessing static variable directly...recommended if accessing in same class
	}
}
//static variable will be craeted at the time of class loading and destroyed at the time of class unloading ,hence of scope of static variable is
//exactly same as scope of .class file

//Static variable will be stored in method area
//we can access static variable either by object reference or by class Name..but recommended to use class Name

//within the same class it is not required to use class name and we can access directly