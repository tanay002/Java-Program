package com.java.features8.MethodReference;

import java.util.function.BiFunction;

class Artithemetic1
{
	public static int add(int a,int b)
	{
		return a+b;	
	}
	public static float add(float a,int b)
	{
		return a+b;	
	}
	public static float add(float a,float b)
	{
		return a+b;	
	}
}
public class MethodStaticReference4
{

	public static void main(String[] args)
	{
		BiFunction<Integer, Integer, Integer> a= Artithemetic1::add;
		BiFunction<Float, Integer, Float> a1= Artithemetic1::add;
		BiFunction<Float, Float, Float> a2= Artithemetic1::add;
		int res=a.apply(10, 20);
		float res1=a1.apply(1.20f, 20);
		float res2=a2.apply(10.3f, 20.8f);
		System.out.println(res);
		System.out.println(res1);
		System.out.println(res2);
	}
}
