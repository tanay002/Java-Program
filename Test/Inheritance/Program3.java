package com.Inheritance;
//Question3  
//This program will generate error.This is for studying purpose only....
class A2
{
	public int i;
	private int j;
}

class B2 extends A2
{  
	void display()
	{
		System.out.println(i+j);  //Error the field A2.j is not visible
	}

}

public class Program3
{
	public static void main(String[] args) 
	{
		B2 a=new B2();
		a.i=1;
		a.j=2;   //Error the field A2.j is not visible,because of private variable...
		                //child can't inherit private methods and variables of parent class
		a.display();
	}
}
