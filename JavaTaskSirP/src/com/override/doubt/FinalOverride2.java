package com.override.doubt;

class Company1
{
	final public void demo()
	{
System.out.println("K");
	}
}

public class FinalOverride2 extends Company1 
{
/*	final public void demo()   //cannot override the final method from company
	{
		System.out.println("A");
	}
*/

	public static void main(String[] args)
	{
    Company1 c=new FinalOverride2();
            c.demo();
	}
}
