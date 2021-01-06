package com.working.sop;

final class Task
{
	static Output op=new Output();
}

class Output
{
	 void demo(String msg)
	{
		System.out.println(msg);
	}
	
	 void demo(int msg)
	{
		System.out.println(msg);
	}
}
public class Computer 
{
	public static void main(String[] args) 
	{
  Task.op.demo("Hello");
	}
}
