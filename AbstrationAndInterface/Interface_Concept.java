package com.AbtsrationAndInterface;

interface Concept 
{
	abstract void method()             //abstract method me hum body nhi de sakte
	                                       //if we want to provide body
	{
		System.out.println("Memo");
	}
}

class Beta implements Concept
{
	public void method()
	{
		System.out.println("Demo");
	}
}

class Alphaa implements Concept
{
	public void method()
	{
		System.out.println("Demo");
	}
}

class Gammaa implements Concept
{
	public void method()
	{
		System.out.println("Demo");
	}
}
class Interface_Concept
{
	public static void main(String[] args) 
	{
		//Concept c=null; NullPointerException
		
	}	

}