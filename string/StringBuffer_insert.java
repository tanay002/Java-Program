package com.string;

public class StringBuffer_insert
{
	
	public static void main(String[] args)
	{ 
		//mutable class
		StringBuffer k=new StringBuffer("Tanay is always awsome and cool");
		k.insert(5," and Rajat sir");    //insert
		System.out.println(k);     
			
		k.insert(5,'c');   
		System.out.println(k);  //char,int,double,float,boolean
	
		k.insert(5,12.5f); 
		System.out.println(k);
	}
}
