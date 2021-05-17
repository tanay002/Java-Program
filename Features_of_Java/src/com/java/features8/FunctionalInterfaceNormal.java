package com.features8;

interface A
{
	void demo();	
}

public class FunctionalInterfaceNormal 
{
	public static void main(String[] args) 
	{
       A a=new A() {
		
	
		public void demo() {
			System.out.println("Hello");
			
		}
	};
	a.demo();
	}
}
