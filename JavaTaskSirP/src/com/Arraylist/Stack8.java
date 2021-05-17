package com.Arraylist;

import java.util.Stack;

public class Stack8
{
public static void main(String[] args) {
	
	Stack s=new Stack();
//	s.add();
		/*
		 * s.add(20); s.add("Tanay"); s.add('c'); s.add(null); s.add(null); s.add(10);
		 */
	s.push(10);
	s.push(20);
	s.add(30); //we can also use add method...confuse i think it will call internally push method or it can be treated as same as push method...
	//but recommended to use push instead of add method
	s.push(15);
	System.out.println(s.peek());
	int k=(int) s.pop();
	System.out.println(k);
	System.out.println(s.peek());
	s.pop();
	s.push(29);
	s.push(9);
	s.push(19);
	s.push(49);
	System.out.println(s.peek());
}
}
