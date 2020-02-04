package com.constructor;

public class Constructor6
{                        
	public Constructor6() 
	{  // this();  //Recursive Constructor calling
		System.out.println("Default");
	}
	public static void main(String[] args) 
	{ 
		System.out.println("Start");
		Constructor6 c1=new Constructor6();
		System.out.println("End");
	}
}
