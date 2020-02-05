package com.final_static;

public class StaticFinal5
{
	static final int id;  //If it is not initialized at the time of declaration .It can be initialized only in static block..
	
	static{
		id=9;
	}
public static void main(String[] args) 
{
	StaticFinal5 f=new StaticFinal5();
	System.out.println("");
}
}
