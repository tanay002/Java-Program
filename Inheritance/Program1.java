package com.Inheritance;
//Question1
class Inheritance
{
	void inheritance()
	{
		System.out.println(1);	
	}

}

class Child extends Inheritance
{
	void child()
	{
		inheritance();
	}

}

public class Program1
{
	public static void main(String[] args) 
	{
		new Child().child();
		new Child().inheritance();
		new Inheritance().inheritance();
	//	new Inheritance().child(); cannot convert form Inheritance to Child
	}
}
