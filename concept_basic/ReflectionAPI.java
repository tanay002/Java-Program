package com.concept_basic;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

class Demo
{
	public Demo() 
	{
		int i=10;
	}	
	public Demo(int i)
	{
		System.out.println(i);	 
	}
	public Demo(String s)
	{
		System.out.println(s);
	}
	public void display()
	{
		System.out.println("Method of Display");
	}

	public void demo()
	{
		System.out.println("Method of demo");
	}
	public void memo()
	{
		System.out.println("Method of memo");
	}

}
class ReflectionAPI
{
	public static void main(String[] args) throws NoSuchMethodException, SecurityException 
	{
		Demo d=new Demo();
		Class c=d.getClass();
		System.out.println("Class name"+c.getName());

		Constructor constructor = c.getConstructor(); 
		System.out.println("The name of constructor is " +constructor.getName()); 

		System.out.println("The public methods of class are : "); 
		Method[] methods = c.getMethods(); 
		for (Method method: methods) 
			System.out.println(method.getName());
	}
}
