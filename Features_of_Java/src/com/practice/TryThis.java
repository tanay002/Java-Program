package com.practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.Stack;

public class TryThis
{ 
	private int sid;
	private String name;
	public TryThis(int sid,String name) 
	{
		this.sid=sid;
		this.name=name;
	}
	public static void main(String[] args)
	{
		TryThis t=new TryThis(102, "Kalo");
		TryThis t1=new TryThis(201,"Bhauua");
		TryThis  t2=new TryThis(302, "usys"); 
    LinkedList<TryThis>s=new LinkedList <TryThis>();
     s.add(t);
     s.add(t1);
     s.add(t2);
     
     
     Stack <TryThis> sk=new Stack<TryThis>();
     sk.add(t);
     sk.add(t1);
     sk.add(t2);
     System.out.println(s.poll()==sk.pop());
     
     
	}
}
