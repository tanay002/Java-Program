package com.block;

class C
{
	{
		System.out.println("super Instance-1");
	}	
	{
		System.out.println("super Instance-2");
	}	
}
class A extends C
{   
	A()
	{  
		System.out.println("parent class constructor invoked");  
	}  

	{
		System.out.println("Instance block of A-1");
	}

	{
		System.out.println("Instance block of A-2");
	}
}  

class IIB_Block5 extends A
{  
	IIB_Block5()
	{  
		super();  
		System.out.println("child class constructor invoked");  
	}  

	IIB_Block5(int a)
	{  
		super();  
		System.out.println("child class constructor invoked "+a);  
	}  

	{
		System.out.println("instance initializer block is invoked");
	}  

	public static void main(String args[])
	{  
		IIB_Block5 b1=new IIB_Block5();  
		IIB_Block5 b2=new IIB_Block5(10);  
	}  
}

