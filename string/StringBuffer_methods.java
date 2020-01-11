package com.string;

public class StringBuffer_methods
{
	
	public static void main(String[] args)
	{ 
		//mutable class
		StringBuffer k=new StringBuffer("Tanay is always awsome and cool");
	
		k.replace(9,15,"Dhruv");    //insert 9 is included and 15 is excluded
		System.out.println(k);     
			
		k.delete(9,15);   
		System.out.println(k); // 9 is included and 15 is excluded
	
		k.reverse();
		System.out.println(k);
		
		
		
	}
}
