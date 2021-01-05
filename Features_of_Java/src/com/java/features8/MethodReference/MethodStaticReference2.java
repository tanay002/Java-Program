package com.java.features8.MethodReference;

public class MethodStaticReference2 
{
	public static void threadStatus()
	{
		System.out.println("Thread is running");
	}
public static void main(String[] args)
{
	Thread t=new Thread(MethodStaticReference2::threadStatus);
	t.start();
}
}
