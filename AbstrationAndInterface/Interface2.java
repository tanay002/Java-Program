package com.AbstrationAndInterface;

interface Books
{
	public abstract void subject();
}
public class Interface2 implements Books
{
	public void subject()
	{
		System.out.println("Java Book");
	}

	public static void main(String[] args) 
	{
      Books b=new Interface2();
      b.subject();
	}
}
