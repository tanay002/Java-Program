package com.override.doubt;

class Company2
{
	public void demo()
	{
System.out.println("K");
	}
}

public class FinalOverride3 extends Company2 
{
	final public void demo()   //overriding nhi chalegi .....normal inheritance rule chalega....jiska reference uski method
	{
		System.out.println("A");
	}


	public static void main(String[] args)
	{
    Company2 c=new FinalOverride3();
            c.demo();
	}
}
