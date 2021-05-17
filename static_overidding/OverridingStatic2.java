package com.staticover;

public class OverridingStatic2
{
	public static void main(String[] args) 
	{
	B1 b=new C1();	
	b.demo(); 
	}
}


class B1
{

	public void demo()
	{
		System.out.println("Parent");
	}
}

class C1 extends B1
{
/*	public static void demo()  //method cannot hide the instance method from B1
	{
        System.out.println("child");
	}

*/
}	


