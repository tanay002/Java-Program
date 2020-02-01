package com.AbtsrationAndInterface;

abstract class First
{
	abstract void demo();
}
abstract class Second extends First
{
	abstract void demo();
}

class Third extends  Second
{
	public void demo()
	{
		System.out.println("Demo Methods");
	}
}
class Fourth extends Third
{
	public void demo()
	{
		System.out.println("Overridded method");
	}
}
public class AbstractClass5 
{
	public static void main(String[] args) 
	{
		Third d=new Third();
		d.demo();
		Second s=new Third();
		s.demo();

		First s1=new Third();
		s1.demo();
		
		Third k=new Fourth();  //Jiska Reference uski Method
		k.demo();
	}
}
