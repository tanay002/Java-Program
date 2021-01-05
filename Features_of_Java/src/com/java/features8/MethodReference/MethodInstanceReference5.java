package com.java.features8.MethodReference;
interface MyInterfacee
{
	void task();	
}
public class MethodInstanceReference5
{
	public void demo2()
	{
		System.out.println("Hello");
	}
	public static void main(String[] args)
	{
		MethodInstanceReference5 m=	new MethodInstanceReference5();
		MyInterfacee my=m::demo2;
		my.task();
	}
}
