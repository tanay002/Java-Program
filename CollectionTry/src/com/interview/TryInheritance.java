package com.interview;

class A
{
	void demo()
	{
		System.out.println("Try A");
	}
}
class B extends A
{
	void demo()
	{
		System.out.println("Try B");
	}
}

class C extends B
{
	void demo()
	{
		System.out.println("Try C");
	}
}
public class TryInheritance 
{
public static void main(String[] args)
{
     C c=new C();	
     B b=new B();
  //   b=c;
     c=b; //cannot convert from  b to c
     b.demo();
}
}
