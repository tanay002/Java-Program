package com.task;

interface Gamma
{
	public void demo();	
}

interface Betaa
{
	public String test(String name);	
}

public class FunctionalInterface 
{
	public static void main(String[] args) 
	{

		Gamma g=()->{

			System.out.println("Hello");
		};
		g.demo();

		Betaa g1=(name)->{
			return name;
		};
		System.out.println(g1.test("Tanay"));
	}
}
