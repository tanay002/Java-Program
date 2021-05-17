package com.inner.classes;
//Case 2- Accessing inner class from instance of outer class
public class OuterClass2
{
	
	class InnerClass
	{
      public void demo()
      {
    	  System.out.print("Hello");
      }    
	}
	
	public void tryThis()
	{
	InnerClass c=new InnerClass();
	c.demo();
	System.out.print(" "+"Tanay");
	}
	
	public static void main(String[] args) {
		OuterClass2 o=new OuterClass2();
		o.tryThis();
	}
}
