package com.nested;

public class LocalInnerClass2 
{ 
	private int i=10;
	static int j=20;
	int k=30;
	
	 void demo2() 
     {
		 //static int w=20; with static method demo2() only final is permitted..static ->ke liye illegal
     	System.out.println("Outer method");
     }
	 
	static class Inner
	{
		static int w=20;  //if we remove class as static then..It give CTE..w cannot decalre as static in non static inner type
       void demo() 
        {
    	   System.out.println(w+" "+j);
        //	System.out.println(i+" "+k+" "+j);  can't access not static context from static context
      //  	demo2();                        can't access not static context from static context
        }
	}
	
	
	public static void main(String[] args) 
	{
		Inner i=new Inner(); //we can access direct inner class if it is static
            i.demo();
            System.out.println(Inner.w);
	}
}
