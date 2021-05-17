package com.Arraylist;

import java.util.Enumeration;
import java.util.Stack;

public class Stack9
{
public static void main(String[] args) {
	
	Stack s=new Stack();
   s.add(10);
   s.add(20);
   s.add(30);
   
   s.add(90);
   s.pop();
   System.out.println(s.peek());
   Enumeration it=s.elements();
   while(it.hasMoreElements())
   {
	   System.out.println(it.nextElement());
   }
}
}
