package com.p;
interface Alpha1
{
	int i=10;
}
interface Beta1
{
	int i=20;	
}
public class InterfaceAmiguity2 implements Beta1,Alpha1
{
	public static void main(String[] args) 
	{
   // System.out.println(i); //ambigious
		
		//call it by class name or reference of that class
   	}
}
