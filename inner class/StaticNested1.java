package com.classs.staticnested;

public class StaticNested1 
{
	static class Nested
	{
		public void task()
		{
			System.out.println("Task is running");	
		}
	}
	
	public static void main(String[] args) 
	{
		Nested ns=new Nested();
		ns.task();
	
	}
}
