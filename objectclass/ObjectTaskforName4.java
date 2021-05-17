package com.practice.object;

class Company
{
	String e="kd";
	static
	{ 
		Employee e=new Employee();
	System.out.println("Employee name is "+e.ename);
	}	
}

class Employee
{
	String ename="Tanay";	
}
public class ObjectTaskforName4 
{
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException 
	{
		Class c=Class.forName("com.practice.object.Company");
		System.out.println(c.getClass());
		Company o=(Company)c.newInstance();
		System.out.println(o.e);
	}
}
