package com.nested;

public class LocalInnerClass 
{ 
	private int i=10;
	static int j=20;
	int k=30;
	
	 void demo2() 
     {
     	System.out.println("Outer method");
     }
	 
	class Inner  //same for class...agar hum class ko static banate hai to hum non-static member ko access nhi kar payenge
	{
       void demo()  //agar hum method ko static banate hai to hum non-static member ko access nhi kar payenge
        {
        	System.out.println(i+" "+k+" "+j);
        	demo2();
        }
	}
	

	//Accessing inner code from static area of outer class
	public static void main(String[] args) 
	{
             LocalInnerClass l=new LocalInnerClass();
             LocalInnerClass.Inner k=l.new Inner();
             k.demo();
	}
}
