package com.AbtsrationAndInterface;

abstract class Alpha
{

	 abstract void method();
	                             //abstract method can be only public and protected,it can't be private and default
	                          //Bydefault it is public
}   //we can’t create abstract method inside normal class. It will give compile time error. 
          //Only abstract class or interface can contain abstract method
class Betaa extends Alpha
{
	public void method()
	{
		System.out.println("Abstract Class method ");
	}
	}

class Gammma extends Alpha
{
	public void method()
	{
		System.out.println("Abstract class Method2 ");
	}
	}

public class AbstractClass
{
	
	public static void main(String[] args)
	{
     Alpha a=new Gammma();
     a.method();
     Alpha a1=new Betaa();
     a1.method();
	//Alpha a2=new Alpha();
	/* We can't create a object of abstract class because there is an abstract method which has 
	 * nothing so we can call that abstract method too. If we will create an object of the abstract class and 
	 * calls the method having no body(as the method is pure virtual) it will give an error.*/
	}

}