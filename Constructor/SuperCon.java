package com.constructor;

class Parent
{
	public Parent(int i)
	{
		System.out.println("Parent");
	}
	
public	Parent()
	{
		System.out.println("Default Parent");
	}

}
class Child extends Parent
{
	Child()
	{ //super();
		System.out.println("java");
	}
	/*
	 * Child(int i) { super(); System.out.println(i); }
	 */
}
public class SuperCon 
{
  public static void main(String[] args) {
	
	  System.out.println("Main");
	  Child child=new Child();
}
}
