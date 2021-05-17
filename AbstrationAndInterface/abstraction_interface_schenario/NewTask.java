package com.abstraction;
abstract class Demo
{
	public abstract void task();
	Demo(String s)
	{
		System.out.println("Hello");
	}
}

public class NewTask extends Demo
{
	
	NewTask(String s)
	{
		super(s);
	}

	public static void main(String[] args) 
	{
		NewTask n=new NewTask("Hello world");
	}

	@Override
	public void task() {
		// TODO Auto-generated method stub
		
	}
}
