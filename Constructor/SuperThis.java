package com.thiss.superr;

class SuperTask
{

}
class Taskk
{
	static void delta()
	{
		System.out.println("delta");
	}
void demo()
{
	System.out.println("demo");
}
}
public class SuperThis extends Taskk
{
	SuperThis()
	{
		this(20);
	System.out.println("Constructor");
	}
	
	SuperThis(int i)
	{   
	
		System.out.println("Para Constructor");
		this.superTaskAlpha();
		super.delta();
		super.demo();
	}
	
	 void superTaskAlpha()
		{ 
			System.out.println("Cool");
		}
	
	
	 void superTaskDelta()
	{ 
		System.out.println("Cool");
	}
    
	static void superThisTask() //static method
	{
		//this(10);
	//	this.superTaskDelta();  //can't use static context
	//	this.superTaskAlpha(); //can't use static context
	System.out.println("This is awsome");	
	}
	
	void superTask()  //non static
	{ 
		this.superThisTask();
		System.out.println("Cool");
	}
	
	public static void main(String[] args)
	{
         SuperThis t=new SuperThis();
          t.superTask();
	}
	
	
}
