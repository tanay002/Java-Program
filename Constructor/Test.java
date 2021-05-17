package com.constructor;

public class Test 
{
    
	{
         System.out.println("Samaj nhi aa riya hai");		
	}
	 Test() 
	  {
	
	   System.out.println("kya pata");
	  
	  }
	 


	Test(int i)
	{
		this(20,10);
		System.out.println("xyz");
	}

	Test(int i,int j)
	{ 
	this("Lala");
       System.out.println("abc");
	}
	Test(String j)
	{
	  this();
   System.out.println(j);
	}
 
	{
		System.out.println("Bawa aa gaya samj me");
	}
	public static void main(String[] args) 
	{
        Test t=new Test(10);
        
	}
	
}
