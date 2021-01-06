package com.java.features8.default_static;
interface Memo
{
	static void demo()
	{
		System.out.println("Hello");	
	}
}
public class StaticTry implements Memo
{
	public static void main(String[] args) 
	{
      Memo.demo();
	}
}
