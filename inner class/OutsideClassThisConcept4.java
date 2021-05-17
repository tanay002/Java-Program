package com.inner.classes;

//Case 4 : Within the inner class "this" always refers current inner class object.If we want to refer current outer class object 
     //we have to use OuterclassName.this.methodName Or VariableNames

class Outer4
{ 
	int i=20;
	void test()
	{
		System.out.println("Test is demo");
		Inner i=new Inner();
		i.demo();
	}
	class Inner
	{
		int i=10;
		void demo()
		{   
			int i=30;
			System.out.println(i); //inner class method
			System.out.println(this.i);  //inner class
			System.out.println(Outer4.this.i); //outer class
			System.out.println("Demo is memo");

		}
	}
}
public class OutsideClassThisConcept4
{
	public static void main(String[] args) 
	{
		Outer4 o=new Outer4();
		o.test();
	}
}
