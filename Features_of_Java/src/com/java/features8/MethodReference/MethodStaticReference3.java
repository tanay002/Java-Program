package com.java.features8.MethodReference;

import java.util.function.BiFunction;

class Artithemetic
{
	public static int add(int a,int b)
	{
		return a+b;	
	}
}
public class MethodStaticReference3
{

	public static void main(String[] args)
	{
		BiFunction<Integer, Integer, Integer> a=Artithemetic::add;
		int res=a.apply(10, 20);
		System.out.println(res);
	}
}
