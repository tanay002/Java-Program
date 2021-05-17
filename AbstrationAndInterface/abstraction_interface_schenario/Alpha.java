package com.abstraction;

interface Beta
{
//	void demo();
}

interface Gamma extends Beta
{
	void demo2();
	default void demo()
	{
	System.out.println("Hello");	
	}

}

abstract class Deltaaa implements Gamma
{
	
	/* public void demo() { System.out.println("Demo is awsome"); } */
	 
	
	public void demo2()
	{
		System.out.println("Demo2 is awsome");
	}
}
public class Alpha extends Deltaaa
{
	public void demo() 
	{ 
		System.out.println("Demo cool"); 
	}
	public static void main(String[] args)
	{
          Deltaaa b= new Alpha();
          b.demo();
          
          Gamma d=new Alpha();
          d.demo();
	
	      //  Beta a=new Alpha();
	       // a.demo();
	}
}