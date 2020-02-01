package com.AbstrationAndInterface;

interface Mobile
{    
	public abstract void demo7();
	public abstract void demo();
	public static void demo5()
	{
		System.out.println("Static method");
	}
	default void demo6()
	{
		System.out.println("default method");
	}
}
abstract class Iphone implements Mobile
{   
	public abstract void demo();
	public void demo5()
	{
		System.out.println("Demo 2");
	}
	public void demo6()
	{
		System.out.println("default method");
	}
}
abstract class Blackberry extends Iphone
{
	public void demo()
	{
		System.out.println("demo");	
	}
}
class MI extends Blackberry implements Mobile
{
	public void demo()
	{
		System.out.println("Overrided method");
	}

	public void demo7()
	{
		System.out.println("Overrided method5");
	}
}
public class AbstractClass8 
{
	public static void main(String[] args)
	{
		Mobile.demo5();
		System.out.println("");
		Blackberry b= new MI();  //method overrided of Blackberry by MI Method
		b.demo();
		b.demo7();
		b.demo6();
		b.demo5();
		System.out.println("");
		Mobile m=new MI();   //method overrided of Mobile by MI Method
		m.demo7();
		m.demo();
		m.demo6();
		System.out.println("");
		Iphone ip=new MI();
		ip.demo();
		ip.demo5();
		ip.demo6();
		ip.demo7();
		System.out.println("");
	        Mobile m2=new MI();
	        m2.demo();
	        m2.demo6();
	        m2.demo7();
	}
}
