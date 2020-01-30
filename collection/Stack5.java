package com.collection;

import java.util.Enumeration;
import java.util.Stack;

public class Stack5 
{
	public static void main(String[] args)
	{
		Stack s=new Stack();
		s.push(10);
		s.push(20);
		s.push(5);
		s.push(7);
		s.push(6);
		int k=(int)s.pop();
		System.out.println("Poped Element is "+k);
		k=(int) s.peek();
		System.out.println("Peek Element is "+k);
		System.out.println("Traverse element is: ");
		Enumeration e=s.elements();
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
	}
}
