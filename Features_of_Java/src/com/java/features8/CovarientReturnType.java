package com.features8;

class Alpha
{ 
	int i=10;
	public Object demo()
	{
		System.out.println("Alpha");
		Alpha a=new Alpha();
		a.i=30;
		System.out.println(a.i);
		return a;
	}
}

class Beta extends Alpha 
{
	public StringJoiner demo()
	{ 
		StringJoiner s=null;
		System.out.println("Beta");
		Beta a=new Beta();
		a.i=40;
		System.out.println(a.i);
		return s;
	}
/*	
	public String demo()
	{
		System.out.println("Beta");
		Beta a=new Beta();
		a.i=40;
		System.out.println(a.i);
		return "455";
	}
	
	public StringJoiner demo()
	{ StringJoiner s=null;
		System.out.println("Beta");
		Beta a=new Beta();
		a.i=40;
		System.out.println(a.i);
		return s;
	}
	*/
}
public class CovarientReturnType 
{
	public static void main(String[] args) {
		
	
         Alpha a =new Beta();
         a.demo();
}
}
