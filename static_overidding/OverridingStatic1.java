package com.staticover;

public class OverridingStatic1 
{
	public static void main(String[] args) 
	{
	B b=new C();	
	C c=new C();
	b.demo();  //Jiska Reference Uski Method .......kyuki Static can't be override
	}
}


class B
{

	public static void demo()
	{
		System.out.println("Parent");
	}
}

class C extends B
{
	public static void demo()
	{
        System.out.println("child");
	}
}	


