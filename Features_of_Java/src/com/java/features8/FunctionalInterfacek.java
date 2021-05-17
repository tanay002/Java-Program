package com.features8;

@FunctionalInterface
interface A1
{
	public abstract void demo();	
	//public abstract void task();
}

public class FunctionalInterfacek
{
	public static void main(String[] args) 
	{
      A1 a=()->
      {
    	  System.out.println("Hello world");
      };
      a.demo();
	}
}
