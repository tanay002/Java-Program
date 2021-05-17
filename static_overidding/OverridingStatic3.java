package com.staticover;

public class OverridingStatic3
{
	public static void main(String[] args) 
	{
	B2 b=new C2();	
	b.demo(); 
	}
}


class B2
{

	public static void demo()
	{
		System.out.println("Parent");
	}
}

class C2 extends B2
{
/*	public void demo()  //This instance method cannot override the static method from B2
	{
        System.out.println("child");
	}
*/
}	


