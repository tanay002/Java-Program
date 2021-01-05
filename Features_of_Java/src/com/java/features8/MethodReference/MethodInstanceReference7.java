package com.java.features8.MethodReference;

import java.util.function.BiFunction;

class AddNumber
{
public int add(int a,int b)
{
return a+b;	
}
}
public class MethodInstanceReference7
{
	public static void main(String[] args)
	{
		BiFunction<Integer, Integer, Integer> i=new AddNumber()::add;
		int res=i.apply(10, 70);
		System.out.println(res);
	}
}
