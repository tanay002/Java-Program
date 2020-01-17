package com.polymorphism_concept;
//In overriding,jiska object uski method
public class OverridingRT1 
{

	public static void main(String[] args)
	{
      A a=new A();
      a.main();
      B b=new B();
      b.main();
      A a1=new B();
      a1.main();
      
    //  B b1=new A(); Cannot convert from A to B  (B=small class and A=higher class)
	}
}

class A
{
	public void main()
	{
		System.out.println("main method of A");
	}

}

class B extends A
{
	public void main()
	{
		System.out.println("main method of B");
	}

}