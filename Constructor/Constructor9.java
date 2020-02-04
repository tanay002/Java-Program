package com.constructor;
//We can initialize the private data member of class by setter() method and by constructor

public class Constructor9
{ 
	private int id;
	private String name;

	public Constructor9(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	public static void main(String[] args) 
	{
		Constructor9 c=new Constructor9(201,"Tanay Saxena");
		System.out.println(c.id+" "+c.name);

	}
}
