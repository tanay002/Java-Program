package com.set;

import java.util.LinkedHashSet;

public class LinkedHashSetTask4
{
	public static void main(String[] args) 
	{
     LinkedHashSet ls=new LinkedHashSet();
     ls.add("Tanay");
     ls.add("bhao");
     ls.add(null);
     ls.add(102);
     ls.add(201);
     ls.add("Tanay");
     ls.add(102);
     ls.add("bhao");
     ls.add(null);
     
     System.out.println(ls);
	}
}
