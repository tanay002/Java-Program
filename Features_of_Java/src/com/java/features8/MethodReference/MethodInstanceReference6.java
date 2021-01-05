package com.java.features8.MethodReference;

public class MethodInstanceReference6
{
	public void demo2()
	{
		System.out.println("Hello");
	}
	public static void main(String[] args)
	{
		Thread t=new Thread(new MethodInstanceReference6()::demo2);
		t.start();
	}
}
