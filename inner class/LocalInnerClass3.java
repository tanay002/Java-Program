package com.nested;

public class LocalInnerClass3
{ 
	private int i=10;
	static int j=20;
	int k=30;

	void demo2() 
	{
		System.out.println("Outer method");
	}

	void demo() 
	{
		System.out.println("Outer");
		Inner i=new Inner();
		i.demo2();
	}

	class Inner
	{
		void demo2() 
		{

			System.out.println(i+" "+k+" "+j);
			LocalInnerClass3.this.demo2(); ///refers current outer class object
			
			this.innerDemo(); //this ->always refers current inner class object...
		}
		
		void innerDemo() 
		{

			System.out.println(i+" "+k+" "+j);
			LocalInnerClass3.this.demo2();
		}
	}


	//Accessing inner code from instance area of outer class
	public static void main(String[] args) 
	{
		LocalInnerClass3 l=new LocalInnerClass3();

		l.demo();
	}
}
