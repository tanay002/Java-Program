package com.override.doubt;

class Company
{
	final public void demo()
	{
System.out.println("K");
	}
}

public class FinalOverride1 extends Company 
{
/*	public void demo()   //cannot override the final method from company
	{
		System.out.println("A");
	}
*/

	public static void main(String[] args)
	{
    Company c=new FinalOverride1();
            c.demo();
	}
}
