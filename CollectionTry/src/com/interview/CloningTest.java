package com.interview;
class Build
{
	void m1()
	{
  System.out.println("A");
	}
	
	static Object sample(A a)
	{
		return a;
	}
}

class B1 extends Build
{
	void m1()
	{
		 System.out.println("B");
	}
}

class C1 extends Build
{
void m1()
{
	 System.out.println("C");
}
}
public class CloningTest
{
public static void main(String[] args) {
	B1 b=new B1();
	C1 c=new C1();
	b=c; //cannot convert from C1 to B1;
	
	
	
}
}
