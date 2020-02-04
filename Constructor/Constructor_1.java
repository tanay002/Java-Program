package com.constructor;

public class Constructor_1 
{
	private int id;
	
	Constructor_1(int id) 
	{
	this.id=id;
	System.out.println(this.id);
	}
	public Constructor_1() {
	System.out.println("JAVA PADO");
	}
	public static void main(String[] args)
	{
    Constructor_1 c=new Constructor_1(8);
    Constructor_1 c1=new Constructor_1();
    System.out.println(c.id);
	}
}
