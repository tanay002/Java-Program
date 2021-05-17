0.
















package com.overloading;
//short ->  int->long->float->double
//char  ->int->long->float->double
public class Overloading 
{

	public void demo(double d,long l) //1
	{
		System.out.println("Double Double");
	}

	public void demo(float d,double d1)  //2
	{
		System.out.println("Float Double");
	}

	public void demo(double d,float d1)
	{
		System.out.println("Double Float");
	}

	public void demo(float d,float d1)  //3  ambigious
	{
		System.out.println("Float Float");
	}

	public static void main(String[] args) 
	{
		Overloading o=new Overloading();
		//o.demo(10,12);
	}
}
