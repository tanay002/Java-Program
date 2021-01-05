package com.java.features8.MethodReference;

interface MyMessage
{
	ConstructorReference8 getMessage(String msg);
}
public class ConstructorReference8
{ 
	public ConstructorReference8(String msg)
	{
		System.out.println(msg);
	}
	public static void main(String[] args)
	{
		MyMessage m=ConstructorReference8::new;
		m.getMessage("Tanay");
	}
}
