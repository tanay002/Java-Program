package com.inheritance;
//This program generated Error,This is for understanding purpose only

//In Multiple Inheritance,If we have 2 parents class and one child class which inherits both parent classes ,
//there may be some methods with same name which may exist in both parent clases.so while calling the method it may confuse which 
//class method should be called..(generate ambiguity problem) so java has removed the concept of multiple inheritance
//and it will display error message at the time when we extends 2 classes 
public class NotSupportedMultipleInheritanceWithReason
{
	
	public static void main(String[] args) 
	{
    Lambda l=new Lambda();
    l.lambda();
    l.alpha();
   l.beta();   //can't be called because 2 classes can't be inherited by extends keyword.so method of another class can't be 
                   //called
	}
}

class Alpha
{
	public void alpha()
	{
		System.out.println("Methods of Alpha");
	}
}


class Beta
{
	public void beta()
	{
		System.out.println("Methods of Beta");
	}
}

class Lambda extends Alpha,Beta  //generate error while extending alpha,beta
{
	public void lambda()
	{
		System.out.println("Methods of Lambda");
	}
}
