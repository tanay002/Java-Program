package com.overloading;

//short/char - int -long-float-double
public class Overloading2
{
	/*
	 * void demo(int i,long j) { System.out.println("first"); }
	 */
	
	void demo(float i,float k)
	{
		System.out.println("second");	
	}

	/*
	 * void demo(long i,long k) { System.out.println("third"); }
	 */
	void demo(double i,int j)
	{
		System.out.println("fourth");
	}
	
	public static void main(String[] args) {
		Overloading2 o=new Overloading2();
       // o.demo(10.0f,20);
	}
}
