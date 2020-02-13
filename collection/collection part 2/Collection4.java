package com.collection;

import java.util.ArrayList;

public class Collection4
{
	public static void main(String[] args) 
	{
	 ArrayList a=new ArrayList();
	 a.add("monu");
	 a.add("tanay");
	 a.add("priya");
	 a.add("minal");      
	 a.add("neha mam");
	 a.add("ritesh sir");
	 a.add("gaurav sir");
	 
	 ArrayList a1=new ArrayList();
	 a1.add("minal");
	 a1.add("priya");
	 a1.add("enquiry wali mam");
	 
	a.retainAll(a1);   //retainAll method remove all the element of arraylist 2 presents in the arraylist 1 
	 System.out.println(a);
	
	}
}
