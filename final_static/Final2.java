package com.final_static;


public class Final2  
{
	final static int i=20; //Case 4

	final static public void demo()                            
	{
		System.out.println("cool2");
	}

	public static void main(String[] args) 
	{
		Final2 f=new Final2();                        
		//Final2.i=30; //case 4 we can class by class name as it is static in nature and we cannot change value of constant variable
		                 //because it is final
	}
}
