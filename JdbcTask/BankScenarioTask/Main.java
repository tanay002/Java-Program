package com.bytecoder.BankScenario;
class A
{
	int i;
	
	A(int j)
	{
		i=j;
	}
}
class B extends A
{
	int i=9;
B()
{
	super(10);
	}
	}
public class Main {
public static void main(String[] args) {
	B b=new B();
System.out.println(b.i);
System.out.println(new B().i);
}
}
